```java
package com.seafoodrestaurant.mobileapp.model;

import java.util.List;
import java.util.Map;

public class Order {
    private String userId;
    private List<String> dishIds;
    private Map<String, String> specialRequests;
    private String estimatedDeliveryTime;

    public Order(String userId, List<String> dishIds, Map<String, String> specialRequests, String estimatedDeliveryTime) {
        this.userId = userId;
        this.dishIds = dishIds;
        this.specialRequests = specialRequests;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getDishIds() {
        return dishIds;
    }

    public void setDishIds(List<String> dishIds) {
        this.dishIds = dishIds;
    }

    public Map<String, String> getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(Map<String, String> specialRequests) {
        this.specialRequests = specialRequests;
    }

    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
}
```