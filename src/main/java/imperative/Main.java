package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Jack", MALE),
                new Person("Jessy", FEMALE),
                new Person("Leo", MALE)
        );
        // imperative approach
        List<Person> females = new ArrayList<>();
        for(Person person : people)
        {
            if(FEMALE.equals(person.gender))
                females.add(person);
        }
        System.out.println("Imperative Approach");
        for(Person female : females)
        {
            System.out.println(female);
        }

        //Declarative Approach
        System.out.println("Declarative Approach");
        Collector<Person, ?, List<Person>> personListCollector = Collectors.toList();
        var list = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(personListCollector);
        list.forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE,FEMALE,OTHER
    }
}
