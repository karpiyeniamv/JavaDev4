package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.CompanyViewModel;
import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.beans.SpecialtyViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import com.assignstudent.etalon.entities.RequestEntity;
import com.assignstudent.etalon.beans.RequestViewModel;

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
        requestViewModel.setCompanyByCompanyId(conversionService.convert(requestEntity.getCompanyByCompanyId(), CompanyViewModel.class));
        requestViewModel.setFacultyByFacultyId(conversionService.convert(requestEntity.getFacultyByFacultyId(), FacultyViewModel.class));
        requestViewModel.setSpecialtyBySpecialtyId(conversionService.convert(requestEntity.getSpecialtyBySpecialtyId(), SpecialtyViewModel.class));
        return requestViewModel;
    }
}
