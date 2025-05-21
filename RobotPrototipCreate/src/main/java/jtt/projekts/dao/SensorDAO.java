package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;

import jtt.projekts.dto.Sensors;


public interface SensorDAO extends GenericDAO<Sensors>{
	List<Sensors> getByRange(int range)  throws SQLException;
	List<Sensors> getByAccuracy(int accuracy)  throws SQLException;
}
