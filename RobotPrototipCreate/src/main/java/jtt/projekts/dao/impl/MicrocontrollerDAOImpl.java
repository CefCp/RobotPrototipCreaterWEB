package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.MicrocontrolerDAO;
import jtt.projekts.dto.Microcontroller;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.MicrocontrolerRespority;

public class MicrocontrollerDAOImpl implements MicrocontrolerDAO{
	@Autowired
	MicrocontrolerRespority controlResp;

	@Override
	public Microcontroller insert(Microcontroller value) {
		List<Microcontroller> users = getAllData();
		
		boolean microExists = false;
		for(Microcontroller u : users) {
			if(u.getAllData() == value.getAllData()) {
				microExists = true;
				break;
			}
		}
		if(microExists) return null;
		
		
		return controlResp.save(value);
	}

	@Override
	public Microcontroller update(Microcontroller value, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID(Microcontroller value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Microcontroller getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Microcontroller> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Microcontroller getByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Microcontroller> getBySize(String size) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Microcontroller> getByVolt(int volt) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}




}
