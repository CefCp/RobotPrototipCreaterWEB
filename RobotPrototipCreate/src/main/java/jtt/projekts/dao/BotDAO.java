package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.Bot;
import jtt.projekts.dto.Microboard;
import jtt.projekts.dto.User;

public interface BotDAO extends GenericDAO<Bot>{
	List<Bot> getByUser(User user)  throws SQLException;
	List<Bot> getByMicroboard(Microboard micro)  throws SQLException;

}
