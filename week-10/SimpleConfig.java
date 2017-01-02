package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by aze on 2017.01.02..
 */

@Component
public class SimpleConfig {
    String username;
    String password;
    int port;
    String databaseName;

    private SimpleConfig(String username, String password, int port, String databaseName) {
        this.username = username;
        this.password = password;
        this.port = port;
        this.databaseName = databaseName;
    }

    @Bean
    public SimpleConfig getSimpleConfig() {
        if (environment.equals("development"))
            return new SimpleConfig("root", "", 3692, "accounts");
        else if (environment.equals("production")) {
            return new SimpleConfig("betterUsername", "saf3rP455w0rd", ...);
        }
    }
}
