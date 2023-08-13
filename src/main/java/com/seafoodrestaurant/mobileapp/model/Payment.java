```java
package com.seafoodrestaurant.mobileapp.model;

import java.io.Serializable;

public class Payment implements Serializable {

    private String paymentId;
    private String userId;
    private String cardNumber;
    private String cardExpiry;
    private String cardCVV;
    private boolean saveInfo;

    public Payment(String paymentId, String userId, String cardNumber, String cardExpiry, String cardCVV, boolean saveInfo) {
        this.paymentId = paymentId;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.cardExpiry = cardExpiry;
        this.cardCVV = cardCVV;
        this.saveInfo = saveInfo;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(String cardCVV) {
        this.cardCVV = cardCVV;
    }

    public boolean isSaveInfo() {
        return saveInfo;
    }

    public void setSaveInfo(boolean saveInfo) {
        this.saveInfo = saveInfo;
    }
}
```