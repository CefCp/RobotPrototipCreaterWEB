package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtt.projekts.dao.UserDAO;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.UserRespority;

@Service
public class UserDAOImpl implements UserDAO{
	@Autowired
	UserRespority userResp;
	
	@Override
	public User insert(User value) {
		
		List<User> users = getAllData();
		
		boolean userExists = false;
		for(User u : users) {
			if(u.getName() == value.getName()) {
				userExists = true;
				break;
			}
		}
		if(userExists) return null;
		
		
		return userResp.save(value);
	}

	@Override
	public User update(User value, int id) {
		User userData = userResp.findById(id).get();
		if(Objects.nonNull(value.getName()) && !value.getName().equals("")) {
			userData.setName(value.getName());
			userData.setPassword(value.getPassword());
			userData.setEmail(value.getEmail());
			userData.setRole(value.getRole());
		}
		return userResp.save(value);
	}

	@Override
	public void delete(int id) {
	userResp.deleteById(id);
	}

	@Override
	public int getID(User value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getByID(int id) {
		userResp.findById(id);
		return null;
	}

	@Override
	public List<User> getAllData() {
		userResp.findAll();
		return null;
	}

	@Override
	public User getByName(String name) throws SQLException {
		
		return null;
	}

	@Override
	public List<User> getByEmail(String email) throws SQLException {
		
		return null;
	}

	@Override
	public List<User> getByRole(String role) throws SQLException {
		
		return null;
	}

}
