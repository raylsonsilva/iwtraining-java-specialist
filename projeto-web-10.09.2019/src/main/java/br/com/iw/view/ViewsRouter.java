package br.com.iw.view;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ViewsRouter implements Serializable {
	
	private String home = "view/turma/index";
	private String cadastrarTurma = "cadastrarTurma.jsf";
	private String listarTurmas = "listarTurmas.jsf";
	private String editarTurma = "editarTurma.jsf";
	
	public String getHome() {
		return home;
	}
	public String getCadastrarTurma() {
		return cadastrarTurma;
	}
	public String getListarTurmas() {
		return listarTurmas;
	}
	public String getEditarTurma() {
		return editarTurma;
	}
}
