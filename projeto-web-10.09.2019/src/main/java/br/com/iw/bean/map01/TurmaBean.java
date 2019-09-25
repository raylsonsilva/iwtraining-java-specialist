package br.com.iw.bean.map01;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.iw.entity.map01.Periodo;
import br.com.iw.entity.map01.Turma;
import br.com.iw.service.map01.TurmaService;
import br.com.iw.view.ViewsRouter;

@Named
@RequestScoped
public class TurmaBean {
	
	@Inject
	private TurmaService turmaService;
	
	@Inject
	private ViewsRouter viewsRouter;

	@Inject
	private Turma turma;
	
	public String salvar() {
		this.turmaService.salvar(this.turma);
		return viewsRouter.getHome();
	}
	
	public List<Turma> listar() {
		return this.turmaService.listar();
	}
	
	public String editarTurma(Long id) {
		this.turma = this.turmaService.buscarPorID(id);
		return viewsRouter.getEditarTurma();
	}
	
	public String atualizar(Turma turma) {
		this.turmaService.atualizar(turma);
		return viewsRouter.getListarTurmas();
	}
	
	public String deletar(Turma turma) {
		this.turmaService.deletar(turma);
		return viewsRouter.getHome();
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public List<Periodo> getPeriodos() {
		return Arrays.asList(Periodo.values());
	}
}
