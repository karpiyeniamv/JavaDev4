package com.assignstudent.etalon.services.impl;

import com.assignstudent.etalon.entities.UserEntity;
import com.assignstudent.etalon.services.UsersService;
import com.assignstudent.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    private static final String USER_ROLE_STUDENT = "student"; //todo create enum with roles

    @Override
    public List<UserEntity> findUserByUserName(String name) {
        return usersRepository.findByUsername(name);
    }

    @Override
    public void createUsers(List<UserEntity> userEntity) {
        usersRepository.save(userEntity);
    }

    public List<UserEntity> findAllStudents() {
        return usersRepository.findByRole(USER_ROLE_STUDENT);
    }
}
