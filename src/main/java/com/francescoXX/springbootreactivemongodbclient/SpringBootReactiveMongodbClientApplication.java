package com.francescoXX.springbootreactivemongodbclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringBootReactiveMongodbClientApplication {

    @Bean
    WebClient webClient() {
        return WebClient.create("http://localhost:8090/rest/player");
    }

    @Bean
    CommandLineRunner commandLineRunner(WebClient webClient) {
        return strings -> webClient
                .get()
                .uri("/all")
                .retrieve()
                .bodyToFlux(Player.class)
                //.filter(player -> player.getName().equals("FRA"))   //Get all players, uncomment to get one player
                .flatMap(playerName -> webClient
                    .get()
                    .uri("/{id}/timedEvents", playerName.getId())
                    .retrieve()
                    .bodyToFlux(PlayerEvent.class)
                )
                .subscribe(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactiveMongodbClientApplication.class, args);
    }
}
