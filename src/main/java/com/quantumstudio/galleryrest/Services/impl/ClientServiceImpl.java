package com.quantumstudio.galleryrest.Services.impl;

import com.quantumstudio.galleryrest.Services.ClientService;
import com.quantumstudio.galleryrest.entities.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService {
	private final ClientService clientService;

	public ClientServiceImpl(ClientService clientService) {
		this.clientService = clientService;
	}

	@Override
	public List<Client> findAll() {
		return clientService.findAll() ;
	}
}
