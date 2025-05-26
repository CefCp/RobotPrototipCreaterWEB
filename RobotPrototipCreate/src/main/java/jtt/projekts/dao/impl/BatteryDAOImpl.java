package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.BatteryDAO;
import jtt.projekts.dto.Battery;

public class BatteryDAOImpl implements BatteryDAO{

	@Override
	public Battery insert(Battery value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Battery update(Battery value, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID(Battery value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Battery getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Battery> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Battery> getByVolt(int volt) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Battery> getBycapacity(int capacity) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
