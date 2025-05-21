package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.User;

public interface UserDAO extends GenericDAO<User> {
	User getByName(String name)  throws SQLException;
	User getByEmail(String email)  throws SQLException;
	List<User> getByRole(String role)  throws SQLException;
}
