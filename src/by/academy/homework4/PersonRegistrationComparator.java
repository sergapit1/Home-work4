package by.academy.homework4;

import java.util.Comparator;

public class PersonRegistrationComparator implements Comparator<Person>  {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.registration.compareTo(o2.registration)<0)
        return 0;
        if (o1.registration.compareTo(o2.registration)>0)
            return 1;
        return -1;
    }
}
