package com.example.demo.annotation;

import com.example.demo.annotation.validator.CustomEmailValidator;
import jakarta.validation.Constraint;
import org.springframework.messaging.handler.annotation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomEmailValidator.class)
public @interface CustomEmailAnnotation {
    String message() default "emailのフォーマットで入力してください";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
