package com.test.java.section6;

import java.util.stream.Collectors;

import com.test.java.section4.Dish;

public class Reducing {
    public static void main(String... args){
        int totalCalories = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (Integer i, Integer j)-> i+j));
        int totalCaloriesWithMethod = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        int totalCaloriesWithoutCollectors = Dish.menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        int totalCaloriesUsingSum = Dish.menu.stream().mapToInt(Dish::getCalories).sum();
    }
}
