package edu.bsuir.MobileOperator.controllers;

import edu.bsuir.MobileOperator.services.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user/")
public class UserController {
    @Autowired
    private IService service;

    @GetMapping("name")
    public String getFirstUserName() {
        return service.getName();
    }

    @GetMapping("id")
    public Long getFirstUserId() {
        return service.getId();
    }
}
