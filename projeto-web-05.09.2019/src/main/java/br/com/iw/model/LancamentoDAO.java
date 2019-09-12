package br.com.iw.model;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.iw.entity.Lancamento;

@Model
public class LancamentoDAO implements DAO {
	
	//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SistemaFinanceiro");
	@PersistenceContext
	private EntityManager entityManager;// = entityManagerFactory.createEntityManager();
	
	@Override
	public void salvar(Object object) {
		entityManager.persist((Lancamento) object);	
	}
	
	@Override
	public List<Lancamento> listar() {
		Query queryResult = entityManager.createQuery("SELECT l FROM Lancamento l");
		List<Lancamento> lancamentos = queryResult.getResultList();
		return lancamentos;
	}
	
	@Override
	public Object buscarPorID(Long id) {
		Lancamento lancamento = (Lancamento) entityManager.find(Lancamento.class, id);
		return lancamento;
	}
	
	@Override
	public void atualizar(Object object) {
		entityManager.merge((Lancamento) object);		
	}
	
	@Override
	public void deletar(Object object) {
		Lancamento lancamento = (Lancamento) object;
		entityManager.remove(entityManager.getReference(Lancamento.class, lancamento.getCodigo()));
	}
	

}
