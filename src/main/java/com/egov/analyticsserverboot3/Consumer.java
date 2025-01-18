package com.egov.analyticsserverboot3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer
{
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    //@Qualifier("analyticsDataCounter")
    //@Autowired
    //Counter analytics_counter;

    //@Qualifier("offerCounter")
   // @Autowired
    //Counter offer_counter;

    @Autowired
    ObjectMapper mapper;

    @KafkaListener(topics = "auth-events", groupId = "1")
    public void consumeAuthEvents(String message) throws IOException
    {
        //analytics_counter.increment();
        Analytic datum =  mapper.readValue(message,Analytic.class);
        logger.info(String.format("#### -> Consumed message -> %s", datum.getDescription()));
    }

    @KafkaListener(topics = "general-events", groupId = "1")
    public void consumeGenEvents(String message) throws IOException
    {
        //analytics_counter.increment();
        //ObjectMapper mapper  = new ObjectMapper();
        //Analytic datum =  mapper.readValue(message,Analytic.class);
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }


}

