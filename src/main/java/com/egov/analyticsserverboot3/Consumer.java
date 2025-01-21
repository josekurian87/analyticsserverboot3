package com.egov.analyticsserverboot3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    ObjectMapper mapper;

    @KafkaListener(topics = "ecom-order-events", groupId = "1")
    public void consumeAuthEvents(String message) throws IOException {
        Analytic datum = mapper.readValue(message, Analytic.class);
        logger.info(String.format("Kafka_eCom -> Consumed message -> %s", datum.getDescription()));
    }

}

