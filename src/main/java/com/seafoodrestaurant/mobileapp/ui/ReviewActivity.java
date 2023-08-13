```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Review;
import com.seafoodrestaurant.mobileapp.services.ReviewService;

public class ReviewActivity extends AppCompatActivity {

    private EditText reviewComment;
    private RatingBar reviewRating;
    private ReviewService reviewService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        reviewComment = findViewById(R.id.review_comment);
        reviewRating = findViewById(R.id.review_rating);
        reviewService = new ReviewService();

        findViewById(R.id.submit_review_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitReview();
            }
        });
    }

    private void submitReview() {
        String comment = reviewComment.getText().toString();
        float rating = reviewRating.getRating();

        if (comment.isEmpty()) {
            Toast.makeText(this, "Please enter a comment", Toast.LENGTH_SHORT).show();
            return;
        }

        if (rating == 0) {
            Toast.makeText(this, "Please rate", Toast.LENGTH_SHORT).show();
            return;
        }

        Review review = new Review(currentUserId, comment, rating);
        reviewService.submitReview(review);

        Toast.makeText(this, "Review submitted", Toast.LENGTH_SHORT).show();
        finish();
    }
}
```