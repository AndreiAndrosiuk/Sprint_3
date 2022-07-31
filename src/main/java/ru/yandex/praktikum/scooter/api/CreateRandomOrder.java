package ru.yandex.praktikum.scooter.api;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;


public class CreateRandomOrder {
    public static Order getRandomOrder() {
        Random random = new Random();

        String firstName = RandomStringUtils.randomAlphabetic(10);
        String lastName = RandomStringUtils.randomAlphabetic(10);
        String address = RandomStringUtils.randomAlphabetic(15);
        String metroStation = RandomStringUtils.randomAlphabetic(15);
        String phone = RandomStringUtils.randomAlphabetic(11);
        Number rentTime = random.nextInt(5);
        String deliveryDate = String.format("%s-%s-%s", random.nextInt(2022), random.nextInt(10) + 1, random.nextInt(30) + 1);
        String comment = RandomStringUtils.randomAlphabetic(20);

        return new Order(firstName, lastName, address, metroStation, phone, rentTime, deliveryDate, comment);
    }
}
