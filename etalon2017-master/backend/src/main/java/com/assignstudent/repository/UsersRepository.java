package com.assignstudent.repository;

import com.assignstudent.etalon.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<UserEntity, Integer> {

    List<UserEntity> findByUsername(String firstName);
    List<UserEntity> findByUsernameAndPassword(String firstName, String password);
    List<UserEntity> findByRole(String role);
}
