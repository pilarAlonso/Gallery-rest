package com.quantumstudio.galleryrest.Services.impl;

import com.quantumstudio.galleryrest.Repositories.PainterRepository;
import com.quantumstudio.galleryrest.Services.PainterService;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
@Service
public class PainterServiceImpl implements PainterService {
	private final PainterRepository painterRepository;

	public PainterServiceImpl(PainterRepository painterRepository) {
		this.painterRepository = painterRepository;
	}

	@Override
	public List<Painter> findAll() {
		return painterRepository.findAll();
	}
}
