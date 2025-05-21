package jtt.projekts.dao.base;

import java.sql.SQLException;
import java.util.List;

import jtt.projekts.dto.User;

public interface GenericDAO<T> {
	public T insert(T value) ;
	public T update(T value, int id) ;
	void delete(int id) ;
	int getID(T value) ;
	T getByID(int id) ;
	List<T> getAllData() ;

}
