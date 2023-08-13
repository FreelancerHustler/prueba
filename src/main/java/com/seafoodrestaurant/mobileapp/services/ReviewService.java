```java
package com.seafoodrestaurant.mobileapp.services;

import com.seafoodrestaurant.mobileapp.model.Review;
import java.util.List;

public class ReviewService {

    private List<Review> reviews;

    public ReviewService(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void submitReview(Review review) {
        reviews.add(review);
        // Here you can add code to update the database
    }

    public float getAverageRating() {
        float total = 0;
        for (Review review : reviews) {
            total += review.getRating();
        }
        return total / reviews.size();
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
```