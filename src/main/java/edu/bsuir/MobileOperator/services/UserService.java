package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(){
        return new User("Алексей", "Махтей", "mac@gmail.com", "Минск, Гурского 2", "password", "335471898", false, 50);
    }
}
