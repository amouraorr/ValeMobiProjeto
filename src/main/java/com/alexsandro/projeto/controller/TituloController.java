package com.alexsandro.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alexsandro.projeto.model.Titulo;
import com.alexsandro.projeto.repository.Titulos;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private Titulos titulos;

	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}
	
	//TODO:Salvar banco de dados
	@RequestMapping(method= RequestMethod.POST)
	public String salvar(Titulo titulo){
		
		//System.out.println(">>>>"+titulo.getTipoDeMercadoria());
		
		titulos.save(titulo);
		return "CadastroTitulo";
		
		
	}
}