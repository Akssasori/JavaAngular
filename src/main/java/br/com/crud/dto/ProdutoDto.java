package br.com.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class ProdutoDto {
	
	@NotBlank
	private String nome;
	@Min(0)
	private float preco;
	
	public ProdutoDto() {
		
	}

	public ProdutoDto(String nome, float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	

}
