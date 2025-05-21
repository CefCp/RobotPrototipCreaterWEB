package jtt.projekts.dao;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dao.base.GenericDAO;

import jtt.projekts.dto.Remote;


public interface RemoteDAO extends GenericDAO<Remote>{
	List<Remote> getByBrand(String brand)  throws SQLException;
	List<Remote> getByFrequancy(int freq)  throws SQLException;
	List<Remote> getByRange(int range)  throws SQLException;
}
