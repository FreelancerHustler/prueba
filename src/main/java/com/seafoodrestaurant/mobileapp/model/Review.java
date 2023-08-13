```java
package com.seafoodrestaurant.mobileapp.model;

public class Review {
    private String userId;
    private String dishId;
    private int rating;
    private String comment;

    public Review(String userId, String dishId, int rating, String comment) {
        this.userId = userId;
        this.dishId = dishId;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
```