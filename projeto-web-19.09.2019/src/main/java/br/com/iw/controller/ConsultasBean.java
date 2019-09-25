package br.com.iw.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Cliente;
import br.com.iw.entity.Pedido;
import br.com.iw.entity.Produto;
import br.com.iw.model.ConsultasDAO;

@Named
@RequestScoped
public class ConsultasBean {
	
	@Inject
	private ConsultasDAO consultasDAO;
		
	public List<Cliente> listar1() {		
		return this.consultasDAO.listar1();
	}
	
	public List<Cliente> listar2() {		
		return this.consultasDAO.listar2();
	}
	
	public List<Pedido> listar3() {		
		return this.consultasDAO.listar3();
	}
	
	public List<Produto> listar4() {		
		return this.consultasDAO.listar4();
	}
	
	public long listar5() {		
		return this.consultasDAO.listar5();
	}
	
	public List<Produto> listar6() {		
		return this.consultasDAO.listar6();
	}
	
	public List<Pedido> listar7() {		
		return this.consultasDAO.listar7();
	}
	
	public List<Produto> listar8() {		
		return this.consultasDAO.listar8();
	}
	
	public List<Pedido> listar9() {		
		return this.consultasDAO.listar9();
	}
	
	public List<Pedido> listar10() {		
		return this.consultasDAO.listar10();
	}
}
