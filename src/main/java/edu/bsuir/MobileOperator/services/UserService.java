package edu.bsuir.MobileOperator.services;

import edu.bsuir.MobileOperator.entities.User;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IService {
    List<User> userList = Arrays.asList(
            new User(1,"Алексей", "Махтей", "mac@gmail.com", "Минск, Гурского 2", "password", "335471898", false, 50),
            new User(2,"Артем", "Масько", "art@gmail.com", "Гомель, Казимирова 5", "pass", "295874124", false, 10),
            new User(3,"Саша", "Тапкин", "tap@gmail.com", "Могилев, Пушкина 51", "pass", "295874124", false, 47),
            new User(4,"Виталий", "Пупов", "pup@gmail.com", "Брест, Кошевого 47", "pass", "295874124", false, 98),
            new User(5,"Николай", "Марчук", "mar@gmail.com", "Гродно, Люцинская 19", "pass", "295872584", false, 17),
            new User(6,"Женя", "Петров", "art@gmail.com", "Гомель, Казимирова 5", "pass", "29178124", false, 6)
    );
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
