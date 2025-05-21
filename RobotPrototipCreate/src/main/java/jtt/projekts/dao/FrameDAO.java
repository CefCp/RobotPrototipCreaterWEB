package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.FrameSize;



public interface FrameDAO extends GenericDAO<FrameSize>{
	List<FrameSize> getBYSize(String size)  throws SQLException;
	List<FrameSize> getByMaterial(String material)  throws SQLException;
}
