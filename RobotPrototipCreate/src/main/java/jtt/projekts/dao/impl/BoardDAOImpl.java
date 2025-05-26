package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.BoardDAO;
import jtt.projekts.dto.Board;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.BoardRespority;

public class BoardDAOImpl implements BoardDAO{

	@Autowired
	BoardRespority boardResp;
	
	@Override
	public Board insert(Board value) {
		List<Board> users = getAllData();
		
		boolean boardExists = false;
		for(Board u : users) {
			if(u.getName() == value.getName()) {
				boardExists = true;
				break;
			}
		}
		if(boardExists) return null;
		
		
		return boardResp.save(value);
	}

	@Override
	public Board update(Board value, int id) {
		Board userData = boardResp.findById(id).get();
		if(Objects.nonNull(value.getName()) && !value.getName().equals("")) {
			userData.setName(value.getName());
			userData.setSize(value.getSize());
			userData.setSizeOfMicro(value.getSizeOfMicro());
			userData.setId(id);
		}
		return boardResp.save(value);
	}

	@Override
	public void delete(int id) {
		boardResp.deleteById(id);
		
	}

	@Override
	public int getID(Board value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board getByID(int id) {
		boardResp.findById(id);
		return null;
	}

	@Override
	public List<Board> getAllData() {
		List<Board> board = (List<Board>) boardResp.findAll();
		return board;
	}

	@Override
	public List<Board> getBySize(String size) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Board> getByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
