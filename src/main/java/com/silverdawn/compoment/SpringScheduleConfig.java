package com.silverdawn.compoment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@ComponentScan({"com.silverdawn"})
@EnableScheduling
public class SpringScheduleConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringScheduleConfig.class);

    @Scheduled(fixedRate = 500L)
    public void getJob() {
    }
}
