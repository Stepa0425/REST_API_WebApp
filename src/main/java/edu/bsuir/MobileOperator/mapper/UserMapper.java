package edu.bsuir.MobileOperator.mapper;

import edu.bsuir.MobileOperator.dto.UserDto;
import edu.bsuir.MobileOperator.entities.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getSurName(),
                user.getEmail(),
                user.getAddress(),
                user.getPassword(),
                user.getPhone(),
                user.isAdmin(),
                user.getBalance()
        );
    }
    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getSurName(),
                userDto.getEmail(),
                userDto.getAddress(),
                userDto.getPassword(),
                userDto.getPhone(),
                userDto.isAdmin(),
                userDto.getBalance()
        );
    }
}
