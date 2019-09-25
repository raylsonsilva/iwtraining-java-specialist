package br.com.iw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToOne;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQuery(
		name = "AumentarPrecos",
		resultClasses = Produto.class,
		procedureName = "APLICAR_AUMENTO_PRODUTOS",
		parameters = {
				@StoredProcedureParameter(mode=ParameterMode.IN,name = "PERCENTUAL_PRECO", type = Double.class)
		}
)
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p" )
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@Column(nullable = false, length = 100)
	private String nome;
	
	@Column(nullable = false)
	private double preco;
	
	@OneToOne
	private Categoria categoria;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
