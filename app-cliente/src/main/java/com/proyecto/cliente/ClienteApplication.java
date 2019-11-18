package com.proyecto.cliente;

import java.text.SimpleDateFormat;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import com.proyecto.cliente.entity.ClienteEntity;
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
				iClienteRepository.save(new ClienteEntity("Nombre 01", "Apellido 01", (long) 21, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1901"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 02", "Apellido 02", (long) 22, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1902"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 03", "Apellido 03", (long) 23, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1903"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 04", "Apellido 04", (long) 24, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1904"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 05", "Apellido 05", (long) 25, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1905"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 06", "Apellido 06", (long) 26, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1906"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 07", "Apellido 07", (long) 27, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1907"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 08", "Apellido 08", (long) 28, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1908"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 09", "Apellido 09", (long) 29, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1909"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 10", "Apellido 10", (long) 20, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1900"),null));
				iClienteRepository.save(new ClienteEntity("Nombre 11", "Apellido 11", (long) 21, new SimpleDateFormat("dd/MM/yyyy").parse("10/10/1901"),null));
			};
		}
}
