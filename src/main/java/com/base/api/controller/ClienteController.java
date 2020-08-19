package com.base.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.api.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("bruno@bc.com.br");
		cliente1.setNome("Bruno");
		cliente1.setTelefone("11961075880");
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("leila@bc.com.br");
		cliente2.setNome("Leila");
		cliente2.setTelefone("11961074555");
		Cliente cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setEmail("edson@bc.com.br");
		cliente3.setNome("Edson");
		cliente3.setTelefone("11961070411");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}
}
