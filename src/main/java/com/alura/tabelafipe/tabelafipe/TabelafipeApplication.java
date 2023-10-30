package com.alura.tabelafipe.tabelafipe;

import com.alura.tabelafipe.tabelafipe.principal.Principal;
import com.alura.tabelafipe.tabelafipe.services.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TabelafipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal.run();
	}
}
