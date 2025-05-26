package jtt.projekts.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jtt.projekts.dao.FrameDAO;
import jtt.projekts.dto.FrameSize;
import jtt.projekts.dto.User;
import jtt.projekts.reposotories.FrameSizeRespority;

public class FrameDAOImpl implements FrameDAO{
	@Autowired
	FrameSizeRespority frameResp;

	@Override
	public FrameSize insert(FrameSize value) {
		List<FrameSize> users = getAllData();
		
		boolean frameSizeExists = false;
		for(FrameSize u : users) {
			if(u.getDimension() == value.getDimension()) {
				frameSizeExists = true;
				break;
			}
		}
		if(frameSizeExists) return null;
		
		
		return frameResp.save(value);
	}

	@Override
	public FrameSize update(FrameSize value, int id) {
			FrameSize userData = frameResp.findById(id).get();
			if(Objects.nonNull(value.getDimension()) && !value.getDimension().equals("")) {
				userData.setId(id);
				userData.setMaterial(value.getMaterial());
				userData.setWeight(value.getWeight());
			}
			return frameResp.save(value);
	}

	@Override
	public void delete(int id) {
		frameResp.deleteById(id);
		
	}

	@Override
	public int getID(FrameSize value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FrameSize getByID(int id) {
		frameResp.findById(id);
		return null;
	}

	@Override
	public List<FrameSize> getAllData() {
		List<FrameSize> frame = (List<FrameSize>) frameResp.findAll();
		return frame;
	}

	@Override
	public List<FrameSize> getBYSize(String size) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FrameSize> getByMaterial(String material) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
