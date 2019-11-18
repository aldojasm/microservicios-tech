package com.proyecto.cliente;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.proyecto.cliente.repository.IClienteRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteApplication.class, args);
	}
	
	@Bean
	@Profile("AmbienteDesarrollo")
	CommandLineRunner iniciarBaseDatos(IClienteRepository iClienteRepository) {
		return args -> {
			
			};
		}
}
