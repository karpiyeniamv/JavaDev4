package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.RequestViewModel;
import com.assignstudent.etalon.entities.RequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

public class RequestEntityToRequestViewModelConverter implements Converter<RequestEntity, RequestViewModel> {
    @Autowired
    private ConversionService conversionService;
    @Override
    public RequestViewModel convert (RequestEntity requestEntity){
        RequestViewModel requestViewModel=new RequestViewModel();
        requestViewModel.setId(requestEntity.getId());
        requestViewModel.setDateFrom(requestEntity.getDateFrom());
        requestViewModel.setDateTo(requestEntity.getDateTo());
        requestViewModel.setQuantity(requestEntity.getQuantity());
        requestViewModel.setScore(requestEntity.getScore());
        /*requestViewModel.setCompanyByCompanyId(conversionService.convert(requestEntity.getCompanyByCompanyId(), CompanyViewModel.class));
        requestViewModel.setFacultyByFacultyId(conversionService.convert(requestEntity.getFacultyByFacultyId(), FacultyViewModel.class));
        requestViewModel.setSpecialtyBySpecialtyId(conversionService.convert(requestEntity.getSpecialtyBySpecialtyId(), SpecialtyViewModel.class));
        */return requestViewModel;
    }
}
