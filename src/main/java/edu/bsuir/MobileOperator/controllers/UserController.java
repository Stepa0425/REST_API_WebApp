package edu.bsuir.MobileOperator.controllers;

import edu.bsuir.MobileOperator.entities.User;
import edu.bsuir.MobileOperator.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user/")
public class UserController{
    @Autowired
    private final UserService userService;
    @GetMapping("0")
    public User getUser(){
        return userService.getUser();
    }
}
