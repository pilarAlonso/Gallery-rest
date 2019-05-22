package com.quantumstudio.galleryrest.Controllers;

import com.quantumstudio.galleryrest.Services.ClientService;
import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ClientController {
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	@GetMapping("/clients")

	public ResponseEntity<List<Client>> findAll() {

		return ResponseEntity.ok(clientService.findAll());

	}


}
