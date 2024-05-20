package com.marinaldojunior.modeloCompra.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marinaldojunior.modeloCompra.domain.Categoria;
import com.marinaldojunior.modeloCompra.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id) {
		
		Categoria obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
		
	}

}
