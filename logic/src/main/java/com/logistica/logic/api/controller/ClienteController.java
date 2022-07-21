package com.logistica.logic.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistica.logic.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente c1 = new Cliente();
		c1.setId(1L);
		c1.setNome("Joao");
		c1.setTelefone("88888-8888");
		c1.setEmail("dasdasdasd");
		
		Cliente c2 = new Cliente();
		c2.setId(2L);
		c2.setNome("Maria");
		c2.setTelefone("78787-8888");
		c2.setEmail("asdweqzxc");
		
		return Arrays.asList(c1 ,c2);
	}
}
