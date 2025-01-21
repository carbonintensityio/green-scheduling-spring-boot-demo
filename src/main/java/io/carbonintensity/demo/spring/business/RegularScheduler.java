package io.carbonintensity.demo.spring.business;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class RegularScheduler {

    private final DemoBusinessService demoBusinessService;

    public RegularScheduler(DemoBusinessService demoBusinessService) {
        this.demoBusinessService = demoBusinessService;
    }

    @Scheduled(cron = "0 0 1 1 1 *")
    public void regularJob() {
        demoBusinessService.runBusinessTasks(Duration.ofSeconds(6));
    }
}
