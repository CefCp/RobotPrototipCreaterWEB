package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.MotorDAO;
import jtt.projekts.dto.Motor;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.MotorRespority;

public class MotorDAOImpl implements MotorDAO{
	@Autowired
	MotorRespority motorResp;

	@Override
	public Motor insert(Motor value) {
		List<Motor> users = getAllData();
		
		boolean motorExists = false;
		for(Motor u : users) {
			if(u.getName() == value.getName()) {
				motorExists = true;
				break;
			}
		}
		if(motorExists) return null;
		
		
		return motorResp.save(value);
	}

	@Override
	public Motor update(Motor value, int id) {
		Motor userData = motorResp.findById(id).get();
		if(Objects.nonNull(value.getName()) && !value.getName().equals("")) {
			userData.setName(value.getName());
			userData.setCurrnetDraw(value.getCurrnetDraw());
			userData.setId(id);
			userData.setVoltage(value.getVoltage());
			userData.setMaxRMP(value.getMaxRMP());
		}
		return motorResp.save(value);
	}

	@Override
	public void delete(int id) {
		motorResp.deleteById(id);
		
	}

	@Override
	public int getID(Motor value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Motor getByID(int id) {
		motorResp.findById(id);
		return null;
	}

	@Override
	public List<Motor> getAllData() {
		List<Motor> motor = (List<Motor>) motorResp.findAll();
		return motor;
	}

	@Override
	public List<Motor> getByVolt(int volt) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Motor> getByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
