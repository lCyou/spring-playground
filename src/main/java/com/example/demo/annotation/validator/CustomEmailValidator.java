package com.example.demo.annotation.validator;

import com.example.demo.annotation.CustomEmailAnnotation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomEmailValidator implements ConstraintValidator<CustomEmailAnnotation, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            return false;
        }

        String localPart = value.split("@")[0];
        if (localPart.contains("..") || localPart.startsWith(".") || localPart.endsWith(".")) {
            return false;
        }

        Pattern emailPattern = Pattern.compile(
                "^[a-zA-Z0-9_+-]+(.[a-zA-Z0-9_+-]+)*@([a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]*\\.)+[a-zA-Z]{2,}$"
        );
        Matcher matcher = emailPattern.matcher(value);
        return matcher.matches();
    }
}
