package com.quantumstudio.galleryrest.Services;

import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;
@Service
public interface PainterService {
	List<Painter> findAll();
}
