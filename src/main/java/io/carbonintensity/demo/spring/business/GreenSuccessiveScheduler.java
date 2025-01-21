package io.carbonintensity.demo.spring.business;

import io.carbonintensity.scheduler.GreenScheduled;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class GreenSuccessiveScheduler {

    private static final Logger log = LoggerFactory.getLogger(GreenSuccessiveScheduler.class);

    private final DemoBusinessService businessService;

    public GreenSuccessiveScheduler(DemoBusinessService businessService) {
        this.businessService = businessService;
    }

    @GreenScheduled(successive = "30s 1M 4h", duration = "40s", zone = "NL")
    public void greenSuccessiveJob() {
        log.info("Run Green Scheduled Successive Job");
        businessService.runBusinessTasks(Duration.ofSeconds(40));
    }
}
