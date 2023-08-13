```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Notification;
import com.seafoodrestaurant.mobileapp.services.NotificationService;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    private ListView notificationList;
    private NotificationService notificationService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notificationList = findViewById(R.id.notificationList);
        notificationService = new NotificationService();

        loadNotifications();
    }

    private void loadNotifications() {
        ArrayList<Notification> notifications = notificationService.getNotifications(currentUserId);
        NotificationAdapter adapter = new NotificationAdapter(this, notifications);
        notificationList.setAdapter(adapter);
    }

    public void optOutNotification(View view) {
        Notification notification = (Notification) view.getTag();
        notificationService.optOutNotification(currentUserId, notification);
        Toast.makeText(this, "You have opted out from this notification.", Toast.LENGTH_SHORT).show();
        loadNotifications();
    }
}
```