package com.assignstudent.etalon.controllers;

import com.assignstudent.etalon.beans.RequestViewModel;
import com.assignstudent.etalon.entities.CompanyEntity;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.entities.SpecialtyEntity;
import com.assignstudent.etalon.services.CompanyService;
import com.assignstudent.etalon.services.FacultyService;
import com.assignstudent.etalon.services.RequestService;
import com.assignstudent.etalon.services.SpecialtyService;
import com.assignstudent.repository.CompanyRepository;
import com.assignstudent.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/request")
public class RequestController {
    @Autowired
    RequestService requestService;
    @Autowired
    CompanyService companyService;
    @Autowired
    FacultyService facultyService;
    @Autowired
    SpecialtyService specialtyService;

    @Autowired
    private ConversionService conversionService;

    private RequestRepository requestRepository;

    CompanyRepository companyRepository;

    @RequestMapping (value = "/showAll", method = RequestMethod.GET)
    public ModelAndView printAllRequests(){
        ModelAndView requestViewModel=new ModelAndView();
        List<RequestEntity> requestEntityList= requestService.getAllRequests();
        requestViewModel.addObject("requests", requestEntityList);
        requestViewModel.setViewName("requestsView");
        return requestViewModel;
    }

    @RequestMapping(value = "/create",produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody RequestEntity createRequest(@RequestBody RequestViewModel requestViewModel) {
        RequestEntity requestEntity=new RequestEntity();

        requestEntity.setDateFrom(requestViewModel.getDateFrom());
        requestEntity.setDateTo(requestViewModel.getDateTo());
        requestEntity.setQuantity(requestViewModel.getQuantity());
        requestEntity.setScore(requestViewModel.getScore());

        requestEntity.setCompanyId(requestViewModel.getCompanyByCompanyId());
        CompanyEntity companyEntity=companyService.findById(requestViewModel.getCompanyByCompanyId());
        requestEntity.setCompanyByCompanyId(companyEntity);

        requestEntity.setFacultyId(requestViewModel.getFacultyByFacultyId());
        FacultyEntity facultyEntity=facultyService.findById(requestViewModel.getFacultyByFacultyId());
        requestEntity.setFacultyByFacultyId(facultyEntity);

        requestEntity.setSpecialtyId(requestViewModel.getSpecialtyBySpecialtyId());
        SpecialtyEntity specialtyEntity=specialtyService.findById(requestViewModel.getSpecialtyBySpecialtyId());
        requestEntity.setSpecialtyBySpecialtyId(specialtyEntity);

        requestService.createRequest(requestEntity);
        return requestEntity;
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
