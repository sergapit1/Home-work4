package by.academy.homework4;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RandomAgeName nr = new RandomAgeName();
        DataContainer<Animal> animalDataContainer = new DataContainer<>(new Animal[0]);
        for (int i = 0; i < 3; i++) {
            String nick = nr.getName();
            int age = nr.getAge();
            animalDataContainer.add(new Animal(nick, age));
            System.out.println(Arrays.toString(animalDataContainer.getData()));

        }

        DataContainer<Person> personDataContainer = new DataContainer<>(new Person[0]);
        for (int i = 0; i < 3; i++) {
            String nick = nr.getName();
            String password = nr.getPass();
            LocalDate date = nr.getDate();
            personDataContainer.add(new Person(nick, password, date));
            System.out.println(Arrays.toString(personDataContainer.getData()));
        }

        DataContainer.sort(animalDataContainer, new AnimalAgeComparator());
        System.out.println("Sort: ");
        System.out.println(Arrays.toString(animalDataContainer.getData()));


        animalDataContainer.delete(0);
        System.out.println("Delete: ");
        System.out.println(Arrays.toString(animalDataContainer.getData()));


        DataContainer.sort(personDataContainer, new PersonRegistrationComparator());
        System.out.println("Sort: ");
        System.out.println(Arrays.toString(personDataContainer.getData()));


        personDataContainer.delete(0);
        System.out.println("Delete: ");
        System.out.println(Arrays.toString(personDataContainer.getData()));
    }

}

