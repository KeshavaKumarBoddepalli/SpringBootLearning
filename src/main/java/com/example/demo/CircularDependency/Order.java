package com.example.demo.CircularDependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order {

    Payment payment;

    Order(Payment payment) {
        this.payment = payment;
    }

    public void setPaymentService(Payment payment) {
        this.payment = payment;
    }

}
