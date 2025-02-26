package com.pedrohlimadev.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private FreteService freteService;

    public OrderService(FreteService freteService) {
        this.freteService = freteService;
    }

    public double calcPrice(Order order) {
        var finalPrice = order.getBasicPrice() - order.getBasicPrice() * (order.getDiscount() / 100);
        return finalPrice + freteService.calcFrete(order.getBasicPrice());
    }
}
