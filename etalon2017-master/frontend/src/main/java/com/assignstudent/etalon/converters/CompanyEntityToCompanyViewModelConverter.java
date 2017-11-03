package com.assignstudent.etalon.converters;

import org.springframework.core.convert.converter.Converter;
import com.assignstudent.etalon.entities.CompanyEntity;
import com.assignstudent.etalon.beans.CompanyViewModel;

public class CompanyEntityToCompanyViewModelConverter implements Converter<CompanyEntity, CompanyViewModel>{

    @Override
    public CompanyViewModel convert(CompanyEntity companyEntity) {
        CompanyViewModel companyViewModel = new CompanyViewModel();
        companyViewModel.setId(companyEntity.getId());
        companyViewModel.setCompanyName(companyEntity.getCompanyName());
        return companyViewModel;
    }
}
