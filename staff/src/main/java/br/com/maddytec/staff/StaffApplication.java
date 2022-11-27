package br.com.maddytec.staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StaffApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffApplication.class, args);
	}

}
