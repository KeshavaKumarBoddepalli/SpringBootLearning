package com.example.demo.Bean_Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // by default singleton
@Scope("singleton") // or "prototype"
public class A {

    // singleton
    // -> 1. same instance ,
    // no.of bean definitions = no.of objects on ioc container
    // by default it will eager
    // we can make it lazy by using @Lazy annotation
    // best or entity classes -> statefull
    // Singleton - desgin pattern

    // prototype
    // -> new instance for every requirment
    // lazy instailization
    // we can't make it eagger instailization
    // best for service classes ( create only when required ) - stateless

    // other scopes
    // 1. request
    // 2. session
    // 3. applicaiton

}
