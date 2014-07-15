package com.rhc.wildfly.quickstart.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ryne Fagin - ryne@redhat.com
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.rhc.wildfly.quickstart")
public class SpringServlet extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringServlet.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringServlet.class, args);
    }

    
}
