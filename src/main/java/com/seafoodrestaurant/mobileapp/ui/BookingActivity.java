```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Booking;
import com.seafoodrestaurant.mobileapp.services.BookingService;

public class BookingActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText editTextGuests;
    private Button buttonBook;

    private BookingService bookingService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        calendarView = findViewById(R.id.calendarView);
        editTextGuests = findViewById(R.id.editTextGuests);
        buttonBook = findViewById(R.id.buttonBook);

        bookingService = new BookingService();

        buttonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeBooking();
            }
        });
    }

    private void makeBooking() {
        long date = calendarView.getDate();
        int guests = Integer.parseInt(editTextGuests.getText().toString());

        Booking booking = new Booking(currentUserId, date, guests);
        boolean isBooked = bookingService.makeBooking(booking);

        if (isBooked) {
            Toast.makeText(this, "Booking confirmed!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed to make booking. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }
}
```