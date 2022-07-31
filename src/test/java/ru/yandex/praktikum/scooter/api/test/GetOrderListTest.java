package ru.yandex.praktikum.scooter.api.test;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.scooter.api.CreateRandomOrder;
import ru.yandex.praktikum.scooter.api.Order;
import ru.yandex.praktikum.scooter.api.OrderModel;

import static org.apache.http.HttpStatus.*;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetOrderListTest {
    Order order = CreateRandomOrder.getRandomOrder();
    OrderModel orderModel;

    @Before
    public void setUp() {
        orderModel = new OrderModel(order.getFirstName(), order.getLastName(), order.getAddress(), order.getMetroStation(),
                order.getPhone(), order.getRentTime(), order.getDeliveryDate(), order.getComment());
    }

    @Test
    @DisplayName("В теле ответа возвращается список заказов")
    @Description("Проверяем, что в теле ответа возвращается список заказов")
    public void requestReturnOrderList() {
        order.createOrder(orderModel)
                .then().statusCode(SC_CREATED);

        order.getOrderList()
                .then().body("orders", notNullValue());
    }
}

