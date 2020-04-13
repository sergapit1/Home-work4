package by.academy.homework4;


import java.util.Objects;

public class Animal {
    public int age;
    public String nick;


    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;

    }

    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                Objects.equals(nick, animal.nick);
    }


}






