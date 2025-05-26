package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;
import jtt.projekts.dto.Microcontroller;
import jtt.projekts.dto.User;

public interface MicrocontrolerDAO extends GenericDAO<Microcontroller>{
	Microcontroller getByName(String name) throws SQLException;
	List<Microcontroller> getBySize(String size) throws SQLException;
	List<Microcontroller> getByVolt(int volt) throws SQLException;
	
}
