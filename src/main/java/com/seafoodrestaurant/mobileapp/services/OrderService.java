```java
package com.seafoodrestaurant.mobileapp.services;

import com.seafoodrestaurant.mobileapp.model.Order;
import com.seafoodrestaurant.mobileapp.model.User;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<String, Order> orders = new HashMap<>();

    public Order createOrder(User user, Map<String, Integer> dishes, String specialRequests) {
        Order order = new Order();
        order.setUserId(user.getId());
        order.setDishes(dishes);
        order.setSpecialRequests(specialRequests);
        order.setEstimatedDeliveryTime(calculateEstimatedDeliveryTime(dishes));

        orders.put(user.getId(), order);

        return order;
    }

    public Order getCurrentOrder(User user) {
        return orders.get(user.getId());
    }

    private int calculateEstimatedDeliveryTime(Map<String, Integer> dishes) {
        // This is a placeholder. In a real app, this would be calculated based on the dishes ordered and the restaurant's current workload.
        return 30;
    }
}
```