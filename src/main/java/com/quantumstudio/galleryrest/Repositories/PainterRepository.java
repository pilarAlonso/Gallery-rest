package com.quantumstudio.galleryrest.Repositories;

import com.quantumstudio.galleryrest.entities.Client;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PainterRepository {
	List<Painter> PainterList=new ArrayList<>();
	public List<Painter> findAll() {

		return PainterList;

	}
}
