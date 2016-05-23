package com.alexsandro.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.projeto.model.Titulo;

public interface Titulos extends JpaRepository<Titulo,Long>{

}
