package com.assignstudent.etalon.controllers;


import com.assignstudent.etalon.entities.UserEntity;
import com.assignstudent.etalon.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private UsersService usersService;


    @RequestMapping(value = "/students", method = RequestMethod.GET)
    @ResponseBody
    public List<UserEntity> getAllStudents() {
        List<UserEntity> allStudents = usersService.findAllStudents();
        return  allStudents;
    }
}
