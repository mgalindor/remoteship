package com.mk.remoteship.spring.config;

import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.aop.TimedAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AopConfiguration {

  @Bean
  TimedAspect timedAspect() {
    return new TimedAspect();
  }

  @Bean
  CountedAspect countedAspect() {
    return new CountedAspect();
  }

}
