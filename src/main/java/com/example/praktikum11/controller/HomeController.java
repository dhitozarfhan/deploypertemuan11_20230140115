package com.example.praktikum11.controller;

import com.example.praktikum11.model.User;
import com.example.praktikum11.repository.UserRepository;
import com.example.praktikum11.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final AuthService authService;
    private final UserRepository userRepository;

    @GetMapping("/home")
    public String home(Model model) {
        User user = authService.getLoggedInUser();
        model.addAttribute("user", user);
        model.addAttribute("profile", user.getProfile());
        return "home";
    }

    @GetMapping("/test-db")
    @ResponseBody
    public List<User> testDb() {
        return userRepository.findAll();
    }
}