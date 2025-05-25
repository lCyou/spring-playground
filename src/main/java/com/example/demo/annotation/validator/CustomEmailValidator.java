package com.example.demo.annotation.validator;

import com.example.demo.annotation.CustomEmailAnnotation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomEmailValidator implements ConstraintValidator<CustomEmailAnnotation, String> {
    @Override
    public void initialize(CustomEmailAnnotation constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
