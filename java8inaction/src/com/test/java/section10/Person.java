package com.test.java.section10;

import java.util.Optional;

public class Person {
    private Car car;

    public Optional<Car> getCar() {
        return Optional.ofNullable(car);
    }
}

class Car {
    private Insurance insurance;

    public Optional<Insurance> getInsurance() {
        return Optional.ofNullable(insurance);
    }
}

class Insurance {
    private String name;

    public String getName() {
        return name;
    }
}
