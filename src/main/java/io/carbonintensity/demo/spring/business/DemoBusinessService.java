package io.carbonintensity.demo.spring.business;

import io.carbonintensity.scheduler.spring.GreenSchedulerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;

import static io.carbonintensity.demo.spring.util.SleepUtil.sleep;

@Service
public class DemoBusinessService {

    private final Logger log = LoggerFactory.getLogger(DemoBusinessService.class);

    @Autowired
    GreenSchedulerProperties properties;

    public void runBusinessTasks(final Duration duration) {
        log.info("Running business tasks during {}.", duration);
        sleep(duration);
        log.info("Finished business tasks.");
    }

}
