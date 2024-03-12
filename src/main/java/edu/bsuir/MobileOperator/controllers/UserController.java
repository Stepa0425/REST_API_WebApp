package edu.bsuir.MobileOperator.controllers;

import edu.bsuir.MobileOperator.dto.UserDto;
import edu.bsuir.MobileOperator.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("user/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto savedUser = userService.createUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
