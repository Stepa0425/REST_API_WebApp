package edu.bsuir.MobileOperator.controllers;

import edu.bsuir.MobileOperator.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class UserController {
    @GetMapping("0")
    public User getUser(){
        return new User("Алексей", "Махтей", "mac@gmail.com", "Минск, Гурского 2", "password", "335471898", false, 50);
    }
}
