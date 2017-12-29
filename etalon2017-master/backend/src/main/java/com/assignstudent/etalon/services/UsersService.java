package com.assignstudent.etalon.services;

import com.assignstudent.etalon.entities.UserEntity;

import java.util.List;

public interface UsersService {

    List<UserEntity> findUserByUserName(String name);

    void createUsers(List<UserEntity> userEntity);

    List<UserEntity> findAllStudents();
}