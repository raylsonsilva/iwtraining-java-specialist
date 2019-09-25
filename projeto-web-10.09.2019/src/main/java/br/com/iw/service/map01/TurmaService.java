package br.com.iw.service.map01;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.iw.entity.map01.Turma;
import br.com.iw.model.map01.TurmaDAO;

public class TurmaService {
	
	@Inject
	private TurmaDAO turmaDAO;
	
	@Transactional
	public void salvar(Turma turma) {
		this.turmaDAO.salvar(turma);
	}
	
	public List<Turma> listar() {		
		return this.turmaDAO.listar();
	}
	
	public Turma buscarPorID(Long id) {		
		return this.turmaDAO.buscarPorID(id);
	}
	
	@Transactional
	public void atualizar(Turma turma) {
		this.turmaDAO.atualizar(turma);		
	}
	
	@Transactional
	public void deletar(Turma turma) {
		this.turmaDAO.deletar(turma);
	}

}
