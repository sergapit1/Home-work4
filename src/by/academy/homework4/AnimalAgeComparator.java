package by.academy.homework4;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge()> o2.getAge()) {
            System.out.println(o1.getAge() + " older than " + o2.getAge());
        } else if (o1.getAge()< o2.getAge()) {
            System.out.println(o1.getAge() + " young than " + o2.getAge());
        } if (o1.getAge()== o2.getAge()){
                    System.out.println(o1.getAge() + " in one year " + o2.getAge());
        }
        return 0;
    }
}
