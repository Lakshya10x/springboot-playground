package com.project.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "currency-service")
public class CurrenyServiceConfiguration {

    // Combination of Configuration Properties and Profiles are very powerful -> Its enables you to externalize all configuration
    // that is needed for your application.

    // Configure these properties in application.properties
    private String url;
    private String username;
    private int key;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public int getKey() {
        return key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
