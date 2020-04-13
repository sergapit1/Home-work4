package by.academy.homework4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        RandomAgeName nr = new RandomAgeName();
        DataContainer<Animal> animalDataContainer = new DataContainer<>(new Animal[0]);

        for (int i = 0; i < 100000; i++) {
            String nick = nr.getName();
            int age = nr.getAge();
            animalDataContainer.add(new Animal(nick, age));
         //   System.out.println(animalDataContainer);
        }

        DataContainer<Person> personDataContainer = new DataContainer<>(new Person[0]);
        for (int i = 0; i < 100000; i++) {
            String nick = nr.getName();
            String password = nr.getPass();
            LocalDate date = nr.getDate();
            personDataContainer.add(new Person(nick, password, date));
           // System.out.println(personDataContainer);
        }


    }
}
