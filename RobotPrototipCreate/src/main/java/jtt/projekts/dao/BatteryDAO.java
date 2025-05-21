package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.Battery;

public interface BatteryDAO extends GenericDAO<Battery>{
	List<Battery> getByVolt(int volt)throws SQLException;
	List<Battery> getBycapacity(int capacity)throws SQLException;
}
