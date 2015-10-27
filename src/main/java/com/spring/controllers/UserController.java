package com.spring.controllers;

import com.spring.domain.User;
import com.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Stanislav Markov mailto: stasmarkov88@gmail.com
 */
@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String profile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findByLogin(authentication.getName());
        model.addAttribute("user", user);
        return "user";
    }
}
