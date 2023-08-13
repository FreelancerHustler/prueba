```java
package com.seafoodrestaurant.mobileapp.model;

import java.util.Date;

public class Booking {
    private String userId;
    private Date date;
    private String time;
    private int numberOfGuests;
    private boolean isConfirmed;

    public Booking(String userId, Date date, String time, int numberOfGuests) {
        this.userId = userId;
        this.date = date;
        this.time = time;
        this.numberOfGuests = numberOfGuests;
        this.isConfirmed = false;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
}
```