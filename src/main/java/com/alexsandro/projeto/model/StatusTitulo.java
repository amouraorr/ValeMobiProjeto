package com.alexsandro.projeto.model;

public enum StatusTitulo {
	
	COMPRA("Compra"),
	VENDA("Venda");
	
	private String TipoDeMercadoria;
	
	StatusTitulo(String TipoDeMercadoria){
		this.TipoDeMercadoria = TipoDeMercadoria;
		
	}
	
	public String getTipoDeMercadoria(){
		return TipoDeMercadoria;
	}
}
