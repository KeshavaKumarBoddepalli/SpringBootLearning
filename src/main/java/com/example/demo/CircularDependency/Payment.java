package com.example.demo.CircularDependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Payment {

    Order order;

    Payment(@Lazy Order order) {
        this.order = order;
    }

    public void setOrderService(Order order) {
        this.order = order;
    }

}
