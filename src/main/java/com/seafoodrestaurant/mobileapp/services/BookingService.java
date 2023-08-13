```java
package com.seafoodrestaurant.mobileapp.services;

import com.seafoodrestaurant.mobileapp.model.Booking;
import com.seafoodrestaurant.mobileapp.model.User;

import java.util.Date;
import java.util.List;

public class BookingService {

    private List<Booking> bookings;

    public BookingService(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Booking makeBooking(User user, Date date, int time, int numberOfGuests) {
        Booking newBooking = new Booking(user.getId(), date, time, numberOfGuests, false);
        bookings.add(newBooking);
        return newBooking;
    }

    public boolean confirmBooking(Booking booking) {
        booking.setConfirmed(true);
        return true;
    }

    public List<Booking> getUserBookings(User user) {
        List<Booking> userBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getUserId().equals(user.getId())) {
                userBookings.add(booking);
            }
        }
        return userBookings;
    }

    public boolean cancelBooking(Booking booking) {
        return bookings.remove(booking);
    }
}
```