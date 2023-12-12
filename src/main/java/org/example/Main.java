package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
    User user=new User("Aytan");
    //of metodunda melumat null ola bilmez
      Optional<User>optionalUser= Optional.of(user);
        System.out.println(optionalUser);
        //ofNullable metodunda ise null olsa bele xeta qaytarmir
        user=null;
        Optional<User>optionalUser1=Optional.ofNullable(user);
        System.out.println(optionalUser1);
    }
}