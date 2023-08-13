```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Payment;
import com.seafoodrestaurant.mobileapp.services.PaymentService;

public class PaymentActivity extends AppCompatActivity {

    private EditText cardNumber;
    private EditText expiryDate;
    private EditText cvv;
    private Button savePaymentButton;
    private PaymentService paymentService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        cardNumber = findViewById(R.id.cardNumber);
        expiryDate = findViewById(R.id.expiryDate);
        cvv = findViewById(R.id.cvv);
        savePaymentButton = findViewById(R.id.savePaymentButton);

        paymentService = new PaymentService();

        savePaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cardNumberInput = cardNumber.getText().toString();
                String expiryDateInput = expiryDate.getText().toString();
                String cvvInput = cvv.getText().toString();

                if (cardNumberInput.isEmpty() || expiryDateInput.isEmpty() || cvvInput.isEmpty()) {
                    Toast.makeText(PaymentActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Payment payment = new Payment(cardNumberInput, expiryDateInput, cvvInput);
                    paymentService.savePaymentInformation(payment);
                    Toast.makeText(PaymentActivity.this, "Payment information saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
```