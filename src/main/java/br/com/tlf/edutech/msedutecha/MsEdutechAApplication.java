package br.com.tlf.edutech.msedutecha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsEdutechAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEdutechAApplication.class, args);
	}

}
