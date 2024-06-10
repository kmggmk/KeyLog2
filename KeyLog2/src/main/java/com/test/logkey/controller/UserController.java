package com.test.logkey.controller;

import com.test.logkey.dto.UserDTO;
import com.test.logkey.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequiredArgsConstructor
public class UserController {

    private final com.test.logkey.controller.UserService userService;

    @GetMapping(value="/join")
    public String join(){

        return "join";
    }

    @PostMapping(value="/joinok")
    public String joinok(UserDTO userDTO){

        System.out.println("dto >>>>>>>>>>>>>> " + userDTO);

        userService.join(userDTO);

        return "redirect:/login";
    }

    @GetMapping(value="/my")
    public String my(){

        //회원만

        return "my";
    }

}
