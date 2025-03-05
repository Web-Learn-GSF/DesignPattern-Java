package com.example.结构型模式.过滤器模式;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class OrCriteriaTest extends TestCase {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", "Female", "Single"));
        persons.add(new Person("Bob", "Male", "Married"));
        persons.add(new Person("Charlie", "Male", "Single"));
        persons.add(new Person("Diana", "Female", "Married"));
        persons.add(new Person("Edward", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales:");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males:");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Female:");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}