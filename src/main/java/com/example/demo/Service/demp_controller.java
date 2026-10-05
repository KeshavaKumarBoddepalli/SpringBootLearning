package com.example.demo.Service;

import org.springframework.stereotype.Component;

@Component
public class demp_controller {
    pay pay;

    demp_controller(PayUpi upi) {
        this.pay = upi;
    }

    public void payment() {
        pay.payment();
    }
}
