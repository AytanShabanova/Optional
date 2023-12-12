package org.example;

import lombok.Data;

@Data
public class User {
    private final String userName;
    public User(String userName){
        this.userName=userName;
    }
}
