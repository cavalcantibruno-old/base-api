package com.base.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.api.domain.model.Client;

@RestController
public class ClientController {

	@GetMapping("/clientes")
	public List<Client> listar() {
		return null;
	}
}
