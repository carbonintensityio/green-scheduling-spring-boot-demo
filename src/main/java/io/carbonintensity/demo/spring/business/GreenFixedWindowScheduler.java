package io.carbonintensity.demo.spring.business;

import io.carbonintensity.scheduler.GreenScheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class GreenFixedWindowScheduler {

    private static final Logger log = LoggerFactory.getLogger(GreenFixedWindowScheduler.class);

    private final DemoBusinessService businessService;

    public GreenFixedWindowScheduler(DemoBusinessService businessService) {
        this.businessService = businessService;
    }

    @GreenScheduled(fixedWindow = "05:15 08:15", duration = "2h", zone = "NL")
    public void greenFixedWindowJob() {
        log.info("Run Green Scheduled Fixed-Window Job");
        businessService.runBusinessTasks(Duration.ofSeconds(40));
    }
}
