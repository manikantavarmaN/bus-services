package com.bus.busservices.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bus")
@Getter
@Setter
public class ConfigProperties {
    private String baseUrl;
    private String key;
    private String defaultTransportModeCode;
}