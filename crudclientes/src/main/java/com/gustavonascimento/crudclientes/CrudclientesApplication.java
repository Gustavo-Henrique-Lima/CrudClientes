package com.gustavonascimento.crudclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API CRUD de clientes", version = "1.0", description = "API criada para atividade avaliativa do módulo 01 do bootcamp Spring 3.0 da escola de programação DevSuperior."))
public class CrudclientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudclientesApplication.class, args);
	}

}
