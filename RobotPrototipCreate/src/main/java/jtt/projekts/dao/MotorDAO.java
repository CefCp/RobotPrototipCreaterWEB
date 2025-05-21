package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;

import jtt.projekts.dto.Motor;


public interface MotorDAO extends GenericDAO<Motor>{
	List<Motor> getByVolt(int volt)  throws SQLException;
	List<Motor> getByName(String name)  throws SQLException;
}
