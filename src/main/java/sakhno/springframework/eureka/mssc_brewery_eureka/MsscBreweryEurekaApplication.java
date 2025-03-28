package sakhno.springframework.eureka.mssc_brewery_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Данный сервис выступает в роли сервера Eureka(регистрация приложений).
 */
@EnableEurekaServer
@SpringBootApplication
public class MsscBreweryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscBreweryEurekaApplication.class, args);
	}

}
