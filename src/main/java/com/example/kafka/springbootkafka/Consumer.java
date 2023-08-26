package com.example.kafka.springbootkafka;
/**
 * @Author Dilan
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "mytopic",groupId = "group_id")
    public void consumeMessage(String message){

        log.info(message);
    }
}
