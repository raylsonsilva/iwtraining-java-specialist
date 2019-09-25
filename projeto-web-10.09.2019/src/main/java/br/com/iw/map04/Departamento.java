package br.com.iw.map04;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String departamento;
	
	private int qtdFuncionarios;
	
	@OneToMany
	private Collection<Colaborador> funcionarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public Collection<Colaborador> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Collection<Colaborador> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
