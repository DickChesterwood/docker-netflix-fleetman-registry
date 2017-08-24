package com.virtualpairprogrammers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FleetmanRegistryApplication {

    @Value("${server.port}")
    private int port;

	public static void main(String[] args) {
		SpringApplication.run(FleetmanRegistryApplication.class, args);
	}


}
