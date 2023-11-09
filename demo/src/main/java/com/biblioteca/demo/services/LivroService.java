package com.biblioteca.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.demo.entities.Livro;
import com.biblioteca.demo.repositories.LivroRepository;

@Service
public class LivroService {
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}
	
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
	
	public Livro updateLivro(Long id, Livro novoLivro) {
		java.util.Optional<Livro> livroOptional = livroRepository.findById(id);
		if (livroOptional.isPresent()) {
			Livro livroExistente = livroOptional.get();
			livroExistente.setDescription(novoLivro.getDescription());
			livroExistente.setIsbn(novoLivro.getIsbn());
				return livroRepository.save(livroExistente);
		} else {
			return null;
		}
	}
	
}