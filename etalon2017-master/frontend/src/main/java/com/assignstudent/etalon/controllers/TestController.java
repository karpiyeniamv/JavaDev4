/*
 This software is the confidential information and copyrighted work of
 NetCracker Technology Corp. ("NetCracker") and/or its suppliers and
 is only distributed under the terms of a separate license agreement
 with NetCracker.
 Use of the software is governed by the terms of the license agreement.
 Any use of this software not in accordance with the license agreement
 is expressly prohibited by law, and may result in severe civil
 and criminal penalties. 
 
 Copyright (c) 1995-2017 NetCracker Technology Corp.
 
 All Rights Reserved.
 
*/
/*
 * Copyright 1995-2017 by NetCracker Technology Corp.,
 * University Office Park III
 * 95 Sawyer Road
 * Waltham, MA 02453
 * United States of America
 * All rights reserved.
 */
package com.assignstudent.etalon.controllers;


import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.services.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author anpi0316
 *         Date: 06.10.2017
 *         Time: 14:04
 */
@Controller
public class TestController {
//    @Autowired
//    StudentService studentService;
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String goToLoginPage() {
//        return "login";
//    }

//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    @ResponseBody
//    public List<User> getUsers() {
//        return UserService.getUsers();
//    }
//    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
//    public StudentViewModel getStudent(@PathVariable int id) {
//        return studentService.findStudent(id);
//    }

    private final TypeDescriptor facultyEntityTypeDescriptor = TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(FacultyEntity.class));
    private final TypeDescriptor facultyViewModelTypeDescriptor = TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(FacultyViewModel.class));
    @Autowired
    private ConversionService conversionService;
    @Autowired
    FacultyService facultyService;
    @RequestMapping(value = "/createSpecialtyModal", method = RequestMethod.GET)
    public @ResponseBody String handler() {
        return "Inside createSpecialtyModal method of MyController";
    }
//    public List<FacultyViewModel> getFaculties (){
//        List<FacultyEntity> allFaculties = facultyService.getAllFaculties();
//        return (List<FacultyViewModel>) conversionService.convert(allFaculties, facultyEntityTypeDescriptor, facultyViewModelTypeDescriptor);
//    }



////////////////////////////////////////////////////////////////////////////////

    @RequestMapping("/createFacultyModal")
   @ResponseBody
    public ModelAndView goToAddInvoice(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Maryia");
        modelAndView.setViewName("add");
        return modelAndView;
    }


    // Handle GET or POST request
    @RequestMapping("/one")
    public @ResponseBody String handlerOne() {
        return "<h1>Inside handlerOne() method of MyController</h1>";
    }

    // Handle POST request only
    @RequestMapping(value = "/two", method = RequestMethod.POST)
    public @ResponseBody String handlerTwo() {
        return "Inside handlerTwo() method of MyController";
    }

    // Handle GET request only
    @RequestMapping(value = "/three", method = RequestMethod.GET)
    public @ResponseBody String handlerThree() {
        return "Inside handlerThree() method of MyController";
    }

    // Handle POST request if the request header
    // contains 'content-type=application/x-www-form-urlencoded'
    @RequestMapping(value = "/four", method = RequestMethod.POST, headers = {
            "content-type=application/x-www-form-urlencoded" })
    public @ResponseBody String handlerFour() {
        return "Inside handlerFour() method of MyController";
    }

    // Handle POST request if the request content type
    // is 'application/x-www-form-urlencoded'
    @RequestMapping(value = "/five", method = RequestMethod.POST, consumes = {
            MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public @ResponseBody String handlerFive() {
        return "Inside handlerFive() method of MyController";
    }

}
/*
 WITHOUT LIMITING THE FOREGOING, COPYING, REPRODUCTION, REDISTRIBUTION,
 REVERSE ENGINEERING, DISASSEMBLY, DECOMPILATION OR MODIFICATION
 OF THE SOFTWARE IS EXPRESSLY PROHIBITED, UNLESS SUCH COPYING,
 REPRODUCTION, REDISTRIBUTION, REVERSE ENGINEERING, DISASSEMBLY,
 DECOMPILATION OR MODIFICATION IS EXPRESSLY PERMITTED BY THE LICENSE
 AGREEMENT WITH NETCRACKER. 
 
 THIS SOFTWARE IS WARRANTED, IF AT ALL, ONLY AS EXPRESSLY PROVIDED IN
 THE TERMS OF THE LICENSE AGREEMENT, EXCEPT AS WARRANTED IN THE
 LICENSE AGREEMENT, NETCRACKER HEREBY DISCLAIMS ALL WARRANTIES AND
 CONDITIONS WITH REGARD TO THE SOFTWARE, WHETHER EXPRESS, IMPLIED
 OR STATUTORY, INCLUDING WITHOUT LIMITATION ALL WARRANTIES AND
 CONDITIONS OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE,
 TITLE AND NON-INFRINGEMENT.
 
 Copyright (c) 1995-2017 NetCracker Technology Corp.
 
 All Rights Reserved.
*/