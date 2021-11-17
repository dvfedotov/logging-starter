package ru.dfed.loggingstarter.autoconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

public class LoggingAutoConfiguration {


    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter(){
        return new CommonsRequestLoggingFilter();
    }
}
