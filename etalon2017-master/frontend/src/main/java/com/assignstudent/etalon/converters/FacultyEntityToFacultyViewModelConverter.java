package com.assignstudent.etalon.converters;

import com.assignstudent.etalon.beans.FacultyViewModel;
import com.assignstudent.etalon.entities.FacultyEntity;
import org.springframework.core.convert.converter.Converter;



public class FacultyEntityToFacultyViewModelConverter implements Converter<FacultyEntity, FacultyViewModel> {

    @Override
    public FacultyViewModel convert(FacultyEntity facultyEntity) {

        FacultyViewModel facultyViewModel = new FacultyViewModel();
        facultyViewModel.setFacultyName(facultyEntity.getFacultyName());
        facultyViewModel.setId((facultyEntity.getId()));
        return facultyViewModel;
    }
}