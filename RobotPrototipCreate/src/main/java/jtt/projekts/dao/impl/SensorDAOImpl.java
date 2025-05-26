package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.SensorDAO;
import jtt.projekts.dto.Sensors;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.SensorRespority;

public class SensorDAOImpl implements SensorDAO{
	@Autowired
	SensorRespority sensorResp;

	@Override
	public Sensors insert(Sensors value) {
		List<Sensors> users = getAllData();
		
		boolean sensorsExists = false;
		for(Sensors u : users) {
			if(u.getAccuracy() == value.getAccuracy()) {
				sensorsExists = true;
				break;
			}
		}
		if(sensorsExists) return null;
		
		
		return sensorResp.save(value);
	}

	@Override
	public Sensors update(Sensors value, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		sensorResp.deleteById(id);
		
	}

	@Override
	public int getID(Sensors value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sensors getByID(int id) {
		sensorResp.findById(id);
		return null;
	}

	@Override
	public List<Sensors> getAllData() {
		List<Sensors> sensors = (List<Sensors>) sensorResp.findAll();
		return sensors;
	}

	@Override
	public List<Sensors> getByRange(int range) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sensors> getByAccuracy(int accuracy) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
