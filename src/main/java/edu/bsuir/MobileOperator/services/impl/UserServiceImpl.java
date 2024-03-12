package edu.bsuir.MobileOperator.services.impl;

import edu.bsuir.MobileOperator.dto.UserDto;
import edu.bsuir.MobileOperator.entities.User;
import edu.bsuir.MobileOperator.exception.ResourceNotFoundException;
import edu.bsuir.MobileOperator.mapper.UserMapper;
import edu.bsuir.MobileOperator.repositories.UserRepository;
import edu.bsuir.MobileOperator.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User newUser = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(newUser);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getId(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User isn't exists with id:" + userId));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map((user)->UserMapper.mapToUserDto(user))
                .toList();
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUser) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User isn't exists with id:" + userId));
    }

}
