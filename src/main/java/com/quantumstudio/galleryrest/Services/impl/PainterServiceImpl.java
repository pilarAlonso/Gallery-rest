package com.quantumstudio.galleryrest.Services.impl;

import com.quantumstudio.galleryrest.Services.ClientService;
import com.quantumstudio.galleryrest.Services.PainterService;
import com.quantumstudio.galleryrest.entities.Client;

import javax.swing.*;
import java.util.List;

public class PainterServiceImpl implements PainterService {
	private final PainterService painterService;
	public PainterServiceImpl(PainterService painterService) {
		this.painterService = painterService;
	}
	@Override
	public List<Painter> findAll() {
		return painterService.findAll();
	}
}
