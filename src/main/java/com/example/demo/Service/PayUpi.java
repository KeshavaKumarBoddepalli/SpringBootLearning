package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component
public class PayUpi implements pay {

    @Override
    public void payment() {
        System.out.println("Paying throw upi");
    }

}
