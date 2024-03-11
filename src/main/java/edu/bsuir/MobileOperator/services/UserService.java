package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.entities.User;
import edu.bsuir.MobileOperator.repositories.UserRepository;
import org.springframework.stereotype.Service;
import static edu.bsuir.MobileOperator.repositories.UserRepository.userList;

@Service
public class UserService implements IService {
    UserRepository userRepository;
    @Override
    public String getName() {


        return userList.stream()
                .findFirst()
                .map(User::getName)
                .orElse("List is empty!");

    }

    @Override
    public Long getId() {
        return userList.stream()
                .findFirst().map(User::getId).orElse(null);

    }
}
