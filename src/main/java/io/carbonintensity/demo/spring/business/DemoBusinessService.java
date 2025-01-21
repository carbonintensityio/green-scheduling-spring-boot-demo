package io.carbonintensity.demo.spring.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Duration;

import static io.carbonintensity.demo.spring.util.SleepUtil.sleep;

@Service
public class DemoBusinessService {

    private final Logger log = LoggerFactory.getLogger(DemoBusinessService.class);

    public void runBusinessTasks(final Duration duration) {
        log.info("Running business tasks during {}.", duration);
        sleep(duration);
        log.info("Finished business tasks.");
    }

}
