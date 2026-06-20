package com.edhy.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edhy.catalogo.model.Catalogo;

public interface CatalogoRepository extends JpaRepository<Catalogo, Long> {
} 
