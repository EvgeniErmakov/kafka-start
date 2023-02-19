package com.example.kafkastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaStartApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("third_topic", "hello kafka11!");
        };
    }

    /*
    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("topic1", "test");
        };
    }
     */
}
