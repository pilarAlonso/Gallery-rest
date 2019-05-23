package com.quantumstudio.galleryrest.Services.impl;

import com.quantumstudio.galleryrest.Repositories.ClientRepository;
import com.quantumstudio.galleryrest.Services.ClientService;
import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
	private final ClientRepository clientRepository;

	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll() ;
	}
}
