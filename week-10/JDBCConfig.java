package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by aze on 2017.01.02..
 */
@Component
public class JDBCConfig {

    public JDBCConfig(SimpleConfig config) {
        // put here everything that is need to set up JDBC connection
    }

    @Bean
    public JDBCConfig asdsada(SimpleConfig config) {
        return new JDBCConfig(config);
    }
}
