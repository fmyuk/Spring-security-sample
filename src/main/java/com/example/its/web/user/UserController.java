package com.example.its.web.user;

import com.example.its.domain.auth.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("userList", service.findAll());
        return "users/list";
    }

    @GetMapping("/creationForm")
    public String showCreationForm(@ModelAttribute UserForm form) {
        return "users/creationForm";
    }

    @PostMapping
    public String create(@Validated UserForm form, BindingResult result) {
        if (result.hasErrors()) {
            return showCreationForm(form);
        }
        return "redirect:/users";
    }
}
