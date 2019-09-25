package br.com.iw.model.map01;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.iw.entity.map01.Turma;

@Model
public class TurmaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;	
	
	public void salvar(Turma turma) {
		this.entityManager.persist(turma);	
	}
	
	public List<Turma> listar() {
		Query queryResult = entityManager.createQuery("SELECT t FROM Turma t");
		List<Turma> lancamentos = queryResult.getResultList();
		return lancamentos;
	}
	
	public void atualizar(Turma turma) {
		entityManager.merge(turma);		
	}
	
	public Turma buscarPorID(Long id) {
		Turma turma = (Turma) entityManager.find(Turma.class, id);
		return turma;
	}
	
	public void deletar(Turma turma) {
		this.entityManager.remove(entityManager.getReference(Turma.class, turma.getId()));	
	}
}
