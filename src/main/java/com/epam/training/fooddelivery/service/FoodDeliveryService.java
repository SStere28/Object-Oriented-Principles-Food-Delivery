package com.epam.training.fooddelivery.service;

import com.epam.training.fooddelivery.domain.*;

import java.util.List;

public interface FoodDeliveryService {

    Customer authenticate(User user);

    List<Food> listAllFood();

    void updateCart(Customer customer, Food food, int pieces);

    Order createOrder(Customer customer);
}
