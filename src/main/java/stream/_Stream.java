package stream;



import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static stream._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Jack", MALE),
                new Person("Jessy", FEMALE),
                new Person("Leo", MALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        Set<Gender> gender =people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());
        System.out.println(gender);

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

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
        MALE,FEMALE,PREFER_NOT_TO_SAY
    }
}
