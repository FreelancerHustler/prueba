```java
package com.seafoodrestaurant.mobileapp.services;

import com.seafoodrestaurant.mobileapp.model.Notification;
import com.seafoodrestaurant.mobileapp.model.User;

import java.util.List;

public class NotificationService {

    public void sendNotification(User user, Notification notification) {
        if (!user.isOptOutNotifications()) {
            // Code to send notification to the user
        }
    }

    public List<Notification> getNotifications(User user) {
        // Code to get list of notifications for the user
        return null;
    }

    public void optOutNotifications(User user) {
        user.setOptOutNotifications(true);
        // Code to update user preferences in the database
    }

    public void optInNotifications(User user) {
        user.setOptOutNotifications(false);
        // Code to update user preferences in the database
    }
}
```