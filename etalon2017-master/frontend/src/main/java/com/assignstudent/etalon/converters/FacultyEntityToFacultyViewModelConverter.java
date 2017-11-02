package com.assignstudent.etalon.converters;

import org.springframework.core.convert.converter.Converter;
import com.assignstudent.etalon.entities.FacultyEntity;
import com.assignstudent.etalon.beans.FacultyViewModel;



public class FacultyEntityToFacultyViewModelConverter implements Converter<FacultyEntity, FacultyViewModel> {

    @Override
    public FacultyViewModel convert(FacultyEntity facultyEntity) {

        FacultyViewModel facultyViewModel = new FacultyViewModel();
        facultyViewModel.setFacultyName(facultyEntity.getFacultyName());
        facultyViewModel.setId((facultyEntity.getId()));
        return facultyViewModel;
    }
}