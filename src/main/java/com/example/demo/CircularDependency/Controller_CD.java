package com.example.demo.CircularDependency;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller_CD {

    // @Autowired
    Order order; // throws an error -> order require payment <-> payment require order
    // @Autowired
    Payment payment;

    // way to remove circular dependencys
    // 1. using field ingection/ setter -ingection
    // mainting good coding practive / class or service - should ask and do its task

    // if we are not initailizing in constructor measn -> spring will create the
    // object completely
    // then we can use as field injection -> works (objects are created), we can set
    // also

    // Lazy Intailization -> make one class lazy -> class level , method level

}
