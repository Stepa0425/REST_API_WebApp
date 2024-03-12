package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    Long getId();
}
