package com.algaworks.osworks.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Danilo");
		cliente1.setTelefone("16 99301-1008");
		cliente1.setEmail("danilo.andrade47@gmail.com");			
			
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Graciela");
		cliente2.setTelefone("16 99286-7247");
		cliente2.setEmail("graciela.archanjo@hotmal.com");
		
		return Arrays.asList(Cliente1, Cliente2);
	}

}
