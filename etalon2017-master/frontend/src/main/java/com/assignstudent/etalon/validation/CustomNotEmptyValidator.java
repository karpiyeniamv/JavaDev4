package com.assignstudent.etalon.validation;


import com.mysql.cj.core.util.StringUtils;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CustomNotEmptyValidator implements ConstraintValidator<CustomNotEmpty, String> {


    @Override
    public void initialize(CustomNotEmpty customNotEmpty) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !StringUtils.isEmptyOrWhitespaceOnly(value);
    }
}
