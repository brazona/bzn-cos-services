package br.brazona.bzn_cos_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BznCosServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BznCosServicesApplication.class, args);
	}

}
