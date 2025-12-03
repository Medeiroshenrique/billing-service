package com.semicolon.challengeOne.services;

import com.semicolon.challengeOne.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderingService {
    @Autowired
    private ShippingService shippingService;

    public Double total(Order order){
        return order.getBasic() -(order.getBasic()* (order.getDiscount())/100)  + shippingService.shipment(order);
    }
}
