package com.assignstudent.etalon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BaseController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex){
        ModelAndView modelAndView = new ModelAndView("error") ;
        modelAndView.addObject("msg", "Something went wrong!");
        return modelAndView;
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public ModelAndView error404(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Error 404. Not found");
        modelAndView.setViewName("error");
        return modelAndView;
    }
}