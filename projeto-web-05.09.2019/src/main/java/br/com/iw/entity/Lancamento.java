package br.com.iw.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lancamento implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	String tipo;
	String pessoa;
	String descricao;
	Double valor;
	Date dataVencimento;
	Date dataPagamento;
	String situacao;
		
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	public String getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Lancamento [codigo=" + codigo + ", tipo=" + tipo + ", pessoa=" + pessoa + ", descricao=" + descricao
				+ ", valor=" + valor + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento
				+ ", situacao=" + situacao + "]";
	}
	
}
