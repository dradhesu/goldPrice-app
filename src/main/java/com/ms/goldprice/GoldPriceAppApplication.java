package com.ms.goldprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // (exclude = {DataSourceAutoConfiguration.class})
public class GoldPriceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldPriceAppApplication.class, args);
	}

}
