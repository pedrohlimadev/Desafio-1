package com.pedrohlimadev.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application {

    public static void main(String[] args) {
        SpringApplication.run(Desafio1Application.class, args);

        Scanner sc = new Scanner(System.in);

        System.out.println("DADOS DO PEDIDO");
        System.out.println("Código: ");
        int codigo = sc.nextInt();
        System.out.println("Price: ");
        double basicPrice = sc.nextDouble();
        System.out.println("Porcentagem de desconto: ");
        double desconto = sc.nextDouble();

        Order order = new Order(codigo, basicPrice, desconto);
        FreteService freteService = new FreteService();
        OrderService orderService = new OrderService(freteService);

        System.out.println("Total a pagar: " + String.format("%.2f", orderService.calcPrice(order)));
    }
}
