package by.academy.homework4;

import java.time.LocalDate;

public class Person {
   public String nick;
    public String password;
    public LocalDate registration;
    public Person(String nick,String password,LocalDate registration){
        this.nick =nick;
        this.password = password;
        this.registration = registration;

    }


}
