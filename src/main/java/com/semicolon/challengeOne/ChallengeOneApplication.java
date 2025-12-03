package com.semicolon.challengeOne;

import com.semicolon.challengeOne.entities.Order;
import com.semicolon.challengeOne.services.OrderingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeOneApplication implements CommandLineRunner {
    private OrderingService orderingService;

    public ChallengeOneApplication(OrderingService orderingService) {
        this.orderingService = orderingService;
    }

	public static void main(String[] args) {
		SpringApplication.run(ChallengeOneApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 0.0);
        System.out.println("Pedido código: " + order.getCode() + "\n" + "Valor total: R$ " + orderingService.total(order));
    }
}
