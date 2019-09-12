package br.com.iw.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.iw.entity.Lancamento;
import br.com.iw.model.LancamentoDAO;

public class LancamentoService {
	
	@Inject
	private LancamentoDAO lancamentoDAO;
	
	@Transactional
	public void salvar(Lancamento lancamento) {
		this.lancamentoDAO.salvar(lancamento);
	}
	
	public List<Lancamento> listar() {		
		return this.lancamentoDAO.listar();
	}

	public Object buscarCodigoLancamento(Long codigo) {
		return this.lancamentoDAO.buscarPorID(codigo);
		
	}

	@Transactional
	public void atualizar(Lancamento lancamento) {
		this.lancamentoDAO.atualizar(lancamento);		
	}
	
	@Transactional
	public void deletar(Lancamento lancamento) {
		this.lancamentoDAO.deletar(lancamento);		
	}

}
