```java
package com.seafoodrestaurant.mobileapp.services;

import com.seafoodrestaurant.mobileapp.model.Payment;
import com.seafoodrestaurant.mobileapp.model.User;

public class PaymentService {

    private User currentUser;

    public PaymentService(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean processPayment(Payment payment) {
        // Here, integrate with a payment gateway to process the payment
        // This is a mock implementation
        if (payment != null && payment.isValid()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean savePaymentInfo(Payment payment) {
        // Here, save the payment information for the current user
        // This is a mock implementation
        if (payment != null && payment.isValid()) {
            currentUser.setPaymentInfo(payment);
            return true;
        } else {
            return false;
        }
    }

    public Payment getSavedPaymentInfo() {
        // Here, return the saved payment information for the current user
        return currentUser.getPaymentInfo();
    }
}
```