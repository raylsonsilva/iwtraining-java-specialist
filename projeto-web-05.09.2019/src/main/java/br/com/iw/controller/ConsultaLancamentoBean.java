package br.com.iw.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.Lancamento;
import br.com.iw.service.LancamentoService;
import br.com.iw.util.FacesUtil;
import br.com.iw.view.ViewsRouter;

@Named
@RequestScoped
public class ConsultaLancamentoBean implements Serializable{

	@Inject
	private LancamentoService lancamentoService;
	
	@Inject
	private ViewsRouter viewsRouter;
	
	@Inject
	private Lancamento lancamento;
		
	public void salvar() {
		this.lancamentoService.salvar(lancamento);
		FacesUtil.addSuccessMessage("Lançamento Cadastrado com Sucesso!");
		this.limpar();
	}
	
	public List<Lancamento> listar() {
		return this.lancamentoService.listar();
	}
	
	public String editarLancamento(Long codigo) {
		this.lancamento = (Lancamento) this.lancamentoService.buscarCodigoLancamento(codigo);
		return viewsRouter.getEditarLancamento();
	}
	
	public void atualizar(Lancamento lancamento) {
		this.lancamentoService.atualizar(lancamento);
		FacesUtil.addSuccessMessage("Lançamento Editado com Sucesso!");
		this.limpar();
	}
	
	public void deletar(Lancamento lancamento) {
		this.lancamentoService.deletar(lancamento);
		FacesUtil.addSuccessMessage("Lançamento Deletado com Sucesso!");
		this.limpar();
	}
	
	
	 @PostConstruct 
	 public void init() { 
		 this.limpar(); 
	 }
	 
	
	public void limpar() {
		this.lancamento = new Lancamento();
	}

	public Lancamento getLancamento() {
		return lancamento;
	}
	
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	
	
	
}