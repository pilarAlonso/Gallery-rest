package com.quantumstudio.galleryrest.Services;

import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ClientService {
	List<Client> findAll();
}
