package edu.bsuir.MobileOperator.services.impl;

import edu.bsuir.MobileOperator.dto.UserDto;
import edu.bsuir.MobileOperator.entities.User;
import edu.bsuir.MobileOperator.mapper.UserMapper;
import edu.bsuir.MobileOperator.repositories.UserRepository;
import edu.bsuir.MobileOperator.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


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
    public Long getId() {
        return null;

    }
}
