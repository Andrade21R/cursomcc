package com.andrade.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrade.cursomc.domain.Categoria;
import com.andrade.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	private CategoriaRepository repo;

	@Autowired
	public CategoriaService(CategoriaRepository repo) {
		this.repo = repo;
	}

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
