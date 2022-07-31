package ru.yandex.praktikum.scooter.api;

import org.apache.commons.lang3.RandomStringUtils;

public class CreateRandomCourier {
    public static Courier getRandomCourier() {
        String login = RandomStringUtils.randomAlphabetic(10);
        String password = RandomStringUtils.randomAlphabetic(10);
        String firstName = RandomStringUtils.randomAlphabetic(10);

        return new Courier(login, password, firstName);
    }
}
