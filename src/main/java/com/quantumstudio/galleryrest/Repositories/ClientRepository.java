package com.quantumstudio.galleryrest.Repositories;

import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ClientRepository {
	List<Client> clientList=new ArrayList<>();
	public List<Client> findAll() {

		return clientList;

	}
}
