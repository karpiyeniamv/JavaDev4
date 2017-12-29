package com.assignstudent.etalon.validation;
import org.springframework.security.core.userdetails.User;
import javax.validation.Constraint;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomNotEmptyValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomNotEmpty {

    String message() default "{CustomNotEmpty}";

    Class<?>[] groups() default {};

    Class<? extends User>[] payload() default {};
}