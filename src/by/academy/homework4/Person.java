package by.academy.homework4;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
   public String nick;
    public String password;
    public LocalDate registration;
    public Person(String nick,String password,LocalDate registration){
        this.nick =nick;
        this.password = password;
        this.registration = registration;

    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", registration=" + registration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) &&
                Objects.equals(password, person.password) &&
                Objects.equals(registration, person.registration);
    }


}
