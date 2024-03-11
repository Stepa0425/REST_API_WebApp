package edu.bsuir.MobileOperator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private  Long id;
    private String name, surName, email, address, password, phone;
    private boolean isAdmin;
    private double balance;
}
