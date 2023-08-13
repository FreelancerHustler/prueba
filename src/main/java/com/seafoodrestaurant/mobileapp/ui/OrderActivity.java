```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Order;
import com.seafoodrestaurant.mobileapp.services.OrderService;

public class OrderActivity extends AppCompatActivity {

    private EditText dishIdInput;
    private EditText specialRequestInput;
    private Button placeOrderButton;
    private OrderService orderService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        dishIdInput = findViewById(R.id.dishIdInput);
        specialRequestInput = findViewById(R.id.specialRequestInput);
        placeOrderButton = findViewById(R.id.placeOrderButton);

        orderService = new OrderService();

        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createOrder();
            }
        });
    }

    private void createOrder() {
        String dishId = dishIdInput.getText().toString();
        String specialRequest = specialRequestInput.getText().toString();

        if (dishId.isEmpty() || specialRequest.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        Order order = new Order();
        order.setDishId(dishId);
        order.setSpecialRequest(specialRequest);
        order.setUserId(currentUserId);

        orderService.createOrder(order, new OrderService.OrderCallback() {
            @Override
            public void onOrderCreated(Order order) {
                Toast.makeText(OrderActivity.this, "Order placed successfully", Toast.LENGTH_SHORT).show();
                currentOrder = order;
            }

            @Override
            public void onError(String error) {
                Toast.makeText(OrderActivity.this, "Error: " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
```