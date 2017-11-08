package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.RequestViewModel;
import com.assignstudent.etalon.converters.RequestEntityToRequestViewModelConverter;
import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.services.RequestService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

@Controller
public class RequestController {

//    @Autowired
//    RequestService requestService;
//
//    @Autowired
//    RequestEntityToRequestViewModelConverter requestEntityToRequestViewModelConverter;
//
//    @RequestMapping(value = "/requestsView", method = RequestMethod.POST)
//    @ResponseBody
//    public List<RequestViewModel> getRequests() {
//        List<RequestViewModel> requestViewModelList = new ArrayList<>();
//        for (RequestEntity item :requestService.getRequests())
//        {
//            requestViewModelList.add(requestEntityToRequestViewModelConverter.convert(item));
//        }
//        return requestViewModelList;
//    }
}
