package com.example.kafkastart;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners  {

    @KafkaListener(topics = "5_topic", groupId = "groupId")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
