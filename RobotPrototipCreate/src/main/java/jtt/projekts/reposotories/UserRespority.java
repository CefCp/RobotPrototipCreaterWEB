package jtt.projekts.reposotories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jtt.projekts.dto.User;

public interface UserRespority extends CrudRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.name = :name")
	User findByName(@Param("name") String name);
	
	@Query("SELECT e FROM User e WHERE e.email = :email")
	User findByEmail(@Param("name") String email);
}
