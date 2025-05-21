package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.Board;



public interface BoardDAO extends GenericDAO<Board>{
	List<Board> getBySize(String size)  throws SQLException;
	List<Board> getByName(String name)  throws SQLException;
}
