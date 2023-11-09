package com.biblioteca.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.demo.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
