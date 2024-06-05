package com.test.logkey.controller;

import com.test.logkey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/index")
    public String index(Model model) {
        //C[R]UD
        //- 1개의 레코드 가져오기

        model.addAttribute("user", userRepository.findById("user01"));
        return "index";
    }

}
