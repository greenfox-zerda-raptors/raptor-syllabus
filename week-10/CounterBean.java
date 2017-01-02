package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by aze on 2017.01.02..
 */
@Component
public class CounterBean {
    int count;

    public CounterBean() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    @Bean
    public CounterBean getCounterBean() {
        return new CounterBean();
    }
}
