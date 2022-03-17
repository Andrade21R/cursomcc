package com.andrade.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrade.cursomc.domain.Categoria;
import com.andrade.cursomc.repositories.CategoriaRepository;
import com.andrade.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	private CategoriaRepository repo;

	@Autowired
	public CategoriaService(CategoriaRepository repo) {
		this.repo = repo;
	}

	public Categoria buscar(Integer id) {
		Categoria obj = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		return obj;
	}
}
