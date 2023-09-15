package com.mx.morlaccesorios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MorlAccesoriosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorlAccesoriosApplication.class, args);
	}

}
