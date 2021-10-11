package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.VO.ResponseTemplateVO;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public Order saveOrder(@RequestBody Order order){
        log.info("Inside Save Order of Order Controller");
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getOrderwithCustomer(@PathVariable("id") Integer orderId){
        log.info("Inside Get Order of Order Controller");
        return orderService.getOrderwithCustomer(orderId);
    }

}
