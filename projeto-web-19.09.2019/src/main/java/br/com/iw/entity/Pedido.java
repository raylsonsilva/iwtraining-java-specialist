package br.com.iw.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p" )
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero;
	
	@Column(nullable = false)
	private Date data_pedido;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	@Column(nullable = false, length = 200)
	private String endereco_entrega;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private Collection<ItemPedido> itensPedidos;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String getEndereco_entraga() {
		return endereco_entrega;
	}

	public void setEndereco_entraga(String endereco_entrega) {
		this.endereco_entrega = endereco_entrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(Collection<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
		
}
