package com.test.logkey.controller;

import com.test.logkey.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {


    @GetMapping("/index")
    public String index(Model model) {

        return "index";
    }

}
