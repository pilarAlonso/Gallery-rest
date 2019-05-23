package com.quantumstudio.galleryrest.Controllers;

import com.quantumstudio.galleryrest.Services.PainterService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;
import java.util.List;
@Controller
public class PainterController {
	private final PainterService painterService;

	public PainterController(PainterService painterService) {
		this.painterService = painterService;
	}

	@GetMapping("/painters")

	public ResponseEntity<List<Painter>> findAll() {

		return ResponseEntity.ok(painterService.findAll());

	}




}
