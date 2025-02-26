package com.pedrohlimadev.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    private Order order;

    public double calcFrete(double price) {
        if (price < 100) {
            return 20;
        } else if (price <= 200) {
            return 12;
        } else {
            return 0;
        }
    }
}
