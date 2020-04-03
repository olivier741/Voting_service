package com.olivier.worksheet;

import java.io.File;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;


@SpringBootApplication
public class WorksheetModellingApplication {

//    private static final Logger LOGGER = LogManager.getLogger(WorksheetModellingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WorksheetModellingApplication.class, args);
//        LOGGER.info("Info level log message");
//        LOGGER.debug("Debug level log message");
//        LOGGER.error("Error level log message");
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
        properties.setLocation(new FileSystemResource("etc" + File.separator + "application.properties"));
        properties.setIgnoreResourceNotFound(true);
//        LOGGER.info("SUCCESS LOAD application.properties");
        return properties;
    }
}
