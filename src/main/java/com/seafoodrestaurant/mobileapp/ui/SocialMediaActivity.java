```java
package com.seafoodrestaurant.mobileapp.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;

public class SocialMediaActivity extends AppCompatActivity {

    private Button facebookButton;
    private Button twitterButton;
    private Button instagramButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        facebookButton = findViewById(R.id.button_facebook);
        twitterButton = findViewById(R.id.button_twitter);
        instagramButton = findViewById(R.id.button_instagram);

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.facebook.com/seafoodrestaurant");
            }
        });

        twitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.twitter.com/seafoodrestaurant");
            }
        });

        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage("https://www.instagram.com/seafoodrestaurant");
            }
        });
    }

    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
```