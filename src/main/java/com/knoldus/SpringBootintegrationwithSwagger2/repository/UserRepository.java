package com.knoldus.SpringBootintegrationwithSwagger2.repository;

import com.knoldus.SpringBootintegrationwithSwagger2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}
