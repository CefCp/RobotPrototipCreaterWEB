package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.BotDAO;
import jtt.projekts.dto.Bot;
import jtt.projekts.dto.Microboard;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.BotRespority;

public class BotDAOImpl implements BotDAO{
	@Autowired
	BotRespority botResp;

	@Override
	public Bot insert(Bot value) {
		List<Bot> users = getAllData();
		
		boolean botExists = false;
		for(Bot u : users) {
			if(u.getBattery() == value.getBattery()) {
				botExists = true;
				break;
			}
		}
		if(botExists) return null;
		
		
		return botResp.save(value);
	}

	@Override
	public Bot update(Bot value, int id) {
		Bot botData = botResp.findById(id).get();
		if(Objects.nonNull(value.getBattery()) && !value.getBattery().equals("")) {
			botData.setBoard(value.getBoard());
			botData.setFrame(value.getFrame());
			botData.setId(id);
			botData.setUser(value.getUser());
		}
		return botResp.save(value);
	}

	@Override
	public void delete(int id) {
		botResp.deleteById(id);
		
	}

	@Override
	public int getID(Bot value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Bot getByID(int id) {
		botResp.findById(id);
		return null;
	}

	@Override
	public List<Bot> getAllData() {
		List<Bot> bots = (List<Bot>) botResp.findAll();
		return bots;
	}

	@Override
	public List<Bot> getByUser(User user) throws SQLException {
		return null;
	}

	@Override
	public List<Bot> getByMicroboard(Microboard micro) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
