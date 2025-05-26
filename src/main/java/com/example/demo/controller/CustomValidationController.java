package com.example.demo.controller;


import com.example.demo.form.UserForm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/validation")
public class CustomValidationController {
//    private final CustomValidationService customValidationService;

    @GetMapping
    public String customFrom (Model model) {
        UserForm form = new UserForm();
        model.addAttribute("userForm", form);
        return "form-validation";
    }

    @PostMapping
    public String customValidationPost(@ModelAttribute UserForm form, BindingResult br, Model model){
        System.out.println(form);

        if (br.hasErrors()) {
            System.out.println("validation failed");
            model.addAttribute(form);
            return "form-validation";
        }
        return "tmp";
    }
}
