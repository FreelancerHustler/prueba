```java
package com.seafoodrestaurant.mobileapp.services;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class SocialMediaService {

    private Context context;

    public SocialMediaService(Context context) {
        this.context = context;
    }

    public void shareOnSocialMedia(String message) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, message);
        context.startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    public void openSocialMediaProfile(String url) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(browserIntent);
    }
}
```