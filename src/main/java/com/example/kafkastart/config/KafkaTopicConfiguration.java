package com.example.kafkastart.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    // Если не указать конфигурацию для топика, создадится по умолчаю свой с partition = 1
    @Bean
    public NewTopic topicExample() {
        return TopicBuilder.name("5_topic")
                .partitions(3)
                .replicas(2)
                .build();
    }
}