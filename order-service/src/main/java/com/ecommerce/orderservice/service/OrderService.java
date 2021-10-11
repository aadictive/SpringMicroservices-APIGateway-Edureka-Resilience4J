package com.ecommerce.orderservice.service;

import com.ecommerce.orderservice.VO.Customer;
import com.ecommerce.orderservice.VO.ResponseTemplateVO;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Order saveOrder(Order order) {
        log.info("Inside saveOrder of Order Service");
        return orderRepository.save(order);
    }

    public ResponseTemplateVO getOrderwithCustomer(Integer orderId) {
        log.info("Inside getOrderwithCustomer of Order Service");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Order order = orderRepository.findByOrderId(orderId);
        Customer customer=
                restTemplate.getForObject("http://CUSTOMER-SERVICE/customers/" + order.getCustId(),Customer.class);
        vo.setOrder(order);
        vo.setCustomer(customer);

        return vo;

    }
}
