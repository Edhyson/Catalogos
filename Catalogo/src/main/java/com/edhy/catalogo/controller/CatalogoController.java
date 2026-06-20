/**
 * 
 */
package com.edhy.catalogo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edhy.catalogo.model.Catalogo;
import com.edhy.catalogo.repository.CatalogoRepository;

/**
 * 
 */
@RestController
@RequestMapping("/api/catalogos/")
public class CatalogoController {
	
	
	 private final CatalogoRepository repository;

	    public CatalogoController(CatalogoRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping
	    public List<Catalogo> listar() {
	        return repository.findAll();
	    }
	    
	    @GetMapping("/{id}")
	    public Catalogo getArticulo(@PathVariable Long id) {
	        return repository.findById(id).get();
	    }

	    @PostMapping
	    public Catalogo crear(@RequestBody Catalogo producto) {
	        return repository.save(producto);
	    }

	    @PutMapping("/{id}")
	    public Catalogo actualizar(@PathVariable Long id, @RequestBody Catalogo producto) {
	        producto.setId(id);
	        return repository.save(producto);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable Long id) {
	        repository.deleteById(id);
	    }

	
}
