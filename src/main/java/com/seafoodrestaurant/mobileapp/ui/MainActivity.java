```java
package com.seafoodrestaurant.mobileapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;

public class MainActivity extends AppCompatActivity {

    private Button menuButton;
    private Button bookingButton;
    private Button orderButton;
    private Button reviewButton;
    private Button locationButton;
    private Button socialMediaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuButton = findViewById(R.id.menuButton);
        bookingButton = findViewById(R.id.bookingButton);
        orderButton = findViewById(R.id.orderButton);
        reviewButton = findViewById(R.id.reviewButton);
        locationButton = findViewById(R.id.locationButton);
        socialMediaButton = findViewById(R.id.socialMediaButton);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });

        bookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BookingActivity.class));
            }
        });

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OrderActivity.class));
            }
        });

        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReviewActivity.class));
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LocationActivity.class));
            }
        });

        socialMediaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SocialMediaActivity.class));
            }
        });
    }
}
```