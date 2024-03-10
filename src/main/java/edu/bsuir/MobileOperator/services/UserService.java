package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.entities.User;
import edu.bsuir.MobileOperator.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserRepository{
    private final UserRepository userRepository;

    public User getUser(){
        return new User("Алексей", "Махтей", "mac@gmail.com", "Минск, Гурского 2", "password", "335471898", false, 50);
    }
}
