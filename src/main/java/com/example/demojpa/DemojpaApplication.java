package com.example.demojpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemojpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClienteRepository clienteRepository) {
		return args -> {
			Cliente cliente1 = new Cliente();
			cliente1.setNombre("Juan");
			cliente1.setEmail("jueam@example.com");
			clienteRepository.save(cliente1);

			System.out.println("todos los clientes: ");
			clienteRepository.findAll().forEach(System.out::println);

			String nombreBuscar = "Juan";
			Cliente clienteEncontrado = clienteRepository.findByNombre(nombreBuscar);
			System.out.println("cliente encontrado por nombre: " + nombreBuscar + ": " + clienteEncontrado);

			clienteRepository.deleteByNombre(nombreBuscar);
			System.out.println("el cliente borrado por nombre: " + nombreBuscar);

			System.out.println("todos los clientes despues de borrar: ");
			clienteRepository.findAll().forEach(System.out::println);
		};
	}

}
