package com.test.java.section10;

import java.util.Optional;

public class OptionalMain {

    public static void main(String... args){
        Person person = new Person();
        Optional<Person> optionalPerson = Optional.of(person);
        System.out.print(getCarInsuranceName(optionalPerson));
    }

    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
    }
}
