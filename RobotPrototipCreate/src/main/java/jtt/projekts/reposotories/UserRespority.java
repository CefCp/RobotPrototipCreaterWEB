package jtt.projekts.reposotories;

import org.springframework.data.repository.CrudRepository;

import jtt.projekts.dto.User;

public interface UserRespority extends CrudRepository<User, Integer>{

}
