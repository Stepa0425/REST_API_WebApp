package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getId(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(Long userId, UserDto updatedUser);
    void deleteUser(Long userId);

}
