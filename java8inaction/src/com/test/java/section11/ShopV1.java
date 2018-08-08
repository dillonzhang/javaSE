package com.test.java.section11;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ShopV1 {
    public double getPrice(String productName) {
        return calculatePrice(productName);
    }

    private double calculatePrice(String product) {
        delay();
        return new Random().nextDouble() * product.charAt(0) + product.charAt(1);
    }
    public Future<Double> getPriceSupplyAsync(String product) {
        return CompletableFuture.supplyAsync(() -> calculatePrice(product));
    }

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();   
        new Thread(() -> {
            try {
                double price = calculatePrice(product);
                futurePrice.complete(price);
            } catch (Exception ex) {
                futurePrice.completeExceptionally(ex);
            }
        }).start();
        return futurePrice;
    }
    
    public static void delay() {
        try{
            Thread.sleep(1000L);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String... args) {
        ShopV1 shop = new ShopV1();
        long start = System.nanoTime();
        Future<Double> futurePrice = shop.getPriceSupplyAsync("MyProduct");
        long invocationTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Invocation returned after " + invocationTime + " msecs");

        System.out.println(" do something else");

        try {
            double price = futurePrice.get(5, TimeUnit.SECONDS);
            System.out.println("Price is " + price);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = ((System.nanoTime() - start) / 1_000_000);
        System.out.println("Price returned after " + retrievalTime + " msecs");

    }
}
