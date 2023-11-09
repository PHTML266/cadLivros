package com.biblioteca.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	private String isbn;
	
	public Livro() {
		
	}

	public Livro(Long id, String descricao, String isbn) {
		super();
		this.id = id;
		this.description = descricao;
		this.isbn = isbn;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long Id) {
		this.id = Id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
