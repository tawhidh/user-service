package com.demo.userservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConfig {
    @KafkaListener(
            topics = Constant.TOPIC_LOCATION_UPDATE,
            groupId = Constant.GROUP_ID_ONE
    )
    public void updatedLocation(String value) {
        log.info("value: " + value);
    }
}
