package br.com.iw.map06;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private int qtdTitulosPublicados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdTitulosPublicados() {
		return qtdTitulosPublicados;
	}

	public void setQtdTitulosPublicados(int qtdTitulosPublicados) {
		this.qtdTitulosPublicados = qtdTitulosPublicados;
	}
	
}
