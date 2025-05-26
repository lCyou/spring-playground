package com.example.demo.form;

import com.example.demo.annotation.CustomEmailAnnotation;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

    @NotEmpty(message="入力してください")
    private String name;

    @NotEmpty(message="入力してください")
    @CustomEmailAnnotation
    private String email;
}
