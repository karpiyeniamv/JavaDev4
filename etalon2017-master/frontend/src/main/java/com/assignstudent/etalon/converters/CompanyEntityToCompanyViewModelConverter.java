package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.CompanyViewModel;
import com.assignstudent.etalon.entities.CompanyEntity;
import org.springframework.core.convert.converter.Converter;

public class CompanyEntityToCompanyViewModelConverter implements Converter<CompanyEntity, CompanyViewModel>{

    @Override
    public CompanyViewModel convert(CompanyEntity companyEntity) {
        CompanyViewModel companyViewModel = new CompanyViewModel();
        companyViewModel.setId(companyEntity.getId());
        companyViewModel.setCompanyName(companyEntity.getCompanyName());
        return companyViewModel;
    }
}
