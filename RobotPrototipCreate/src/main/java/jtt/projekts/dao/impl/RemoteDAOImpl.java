package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.RemoteDAO;
import jtt.projekts.dto.Remote;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.RemoteRespority;

public class RemoteDAOImpl implements RemoteDAO{
	@Autowired
	RemoteRespority remoteResp;

	@Override
	public Remote insert(Remote value) {
		List<Remote> users = getAllData();
		
		boolean remoteExists = false;
		for(Remote u : users) {
			if(u.getBatteryType() == value.getBatteryType()) {
				remoteExists = true;
				break;
			}
		}
		if(remoteExists) return null;
		
		
		return remoteResp.save(value);
	}

	@Override
	public Remote update(Remote value, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		remoteResp.deleteById(id);
		
	}

	@Override
	public int getID(Remote value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Remote getByID(int id) {
		remoteResp.findById(id);
		return null;
	}

	@Override
	public List<Remote> getAllData() {
		List<Remote> remote = (List<Remote>) remoteResp.findAll();
		return remote;
	}

	@Override
	public List<Remote> getByBrand(String brand) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Remote> getByFrequancy(int freq) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Remote> getByRange(int range) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
