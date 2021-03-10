/*
 * @(#) DataSource1Config.java 2021/3/5
 *
 * Copyright (c) 2016, XUWC Technology. All Rights Reserved. XUWC Technology. CONFIDENTIAL
 */
package com.jta.atomikos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author xuwc
 * @version 1.0
 * @since 2021/3/5
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource.test2")
@Data
public class DataSource2Config {

    private String driverClassName;
    private String jdbcUrl;
    private String username;
    private String password;

}
