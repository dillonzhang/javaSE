package com.test.java.section6;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

import com.test.java.section4.Dish;

public class Summarizing {
    public static void main(String... args){
        long howManyDishes = Dish.menu.stream().count();
        Dish mostCaloricDish = Dish.menu.stream().collect(Collectors.reducing((Dish d1, Dish d2) -> d1.getCalories() > d2.getCalories()? d1: d2)).get();
        int calculateTotalCalories = Dish.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        Double calculateAverageCalories = Dish.menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        IntSummaryStatistics statistics = Dish.menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        String dishNames = Dish.menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
    }
}
