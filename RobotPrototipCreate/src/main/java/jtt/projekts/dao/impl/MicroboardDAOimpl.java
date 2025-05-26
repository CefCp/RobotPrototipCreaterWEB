package jtt.projekts.dao.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.MicroboardDAO;
import jtt.projekts.dto.Microboard;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.MicroboardRespority;

public class MicroboardDAOimpl implements MicroboardDAO{
	@Autowired
	MicroboardRespority microResp;

	@Override
	public Microboard insert(Microboard value) {
		List<Microboard> users = getAllData();
		
		boolean microboardExists = false;
		for(Microboard u : users) {
			if(u.getClass() == value.getClass()) {
				microboardExists = true;
				break;
			}
		}
		if(microboardExists) return null;
		
		
		return microResp.save(value);
	}

	@Override
	public Microboard update(Microboard value, int id) {
		Microboard userData = microResp.findById(id).get();
		if(Objects.nonNull(value.getClass()) && !value.getClass().equals("")) {
		}
		return microResp.save(value);
	}

	@Override
	public void delete(int id) {
		microResp.deleteById(id);
		
	}

	@Override
	public int getID(Microboard value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Microboard getByID(int id) {
		microResp.findById(id);
		return null;
	}

	@Override
	public List<Microboard> getAllData() {
		List<Microboard> micro = (List<Microboard>) microResp.findAll();
		return micro;
	}

}
