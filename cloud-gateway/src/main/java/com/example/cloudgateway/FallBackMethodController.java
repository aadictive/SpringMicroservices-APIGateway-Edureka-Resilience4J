package com.example.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/orderServiceFallBack")
    public String orderServiceFallBackMethod(){
        return "Order Service is taking longer than Expected." +
                "Please try again later!";
    }

    @GetMapping("/customerServiceFallBack")
    public String customerServiceFallBackMethod(){
        return "Customer Service is taking longer than Expected." +
                "Please try again later!";
    }
}
