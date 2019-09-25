package br.com.iw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codItem;
	
	@Column(nullable = false)
	private int qtde;
	
	@OneToOne
	private Produto produto;

	public long getCodItem() {
		return codItem;
	}

	public void setCodItem(long codItem) {
		this.codItem = codItem;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProdutos(Produto produto) {
		this.produto = produto;
	}
		
}
