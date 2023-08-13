```java
package com.seafoodrestaurant.mobileapp.model;

public class Notification {
    private String userId;
    private String message;
    private boolean optOutStatus;

    public Notification(String userId, String message, boolean optOutStatus) {
        this.userId = userId;
        this.message = message;
        this.optOutStatus = optOutStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isOptOutStatus() {
        return optOutStatus;
    }

    public void setOptOutStatus(boolean optOutStatus) {
        this.optOutStatus = optOutStatus;
    }
}
```