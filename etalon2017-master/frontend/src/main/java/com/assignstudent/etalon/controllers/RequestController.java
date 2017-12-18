package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.services.RequestService;
import com.assignstudent.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/request")
public class RequestController {
    @Autowired
    RequestService requestService;

    @Autowired
    private ConversionService conversionService;

    private RequestRepository requestRepository;

    @RequestMapping (value = "/showAll", method = RequestMethod.GET)
    public ModelAndView printAllRequests(){
        ModelAndView requestViewModel=new ModelAndView();
        List<RequestEntity> requestEntityList= requestService.getAllRequests();
        requestViewModel.addObject("requests", requestEntityList);
        requestViewModel.setViewName("requestsView");
        return requestViewModel;
    }


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
