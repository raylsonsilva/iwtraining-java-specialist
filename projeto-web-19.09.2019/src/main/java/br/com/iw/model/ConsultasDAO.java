package br.com.iw.model;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import br.com.iw.entity.Cliente;
import br.com.iw.entity.Pedido;
import br.com.iw.entity.Produto;
import br.com.iw.entity.StatusPedido;

public class ConsultasDAO {
	
	@PersistenceContext
	private EntityManager entityManager;	
		
	@SuppressWarnings("unchecked")
	public List<Cliente> listar1() {
		Query queryResult = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nome = :nome");
		queryResult.setParameter("nome", "Tio Patinhas");
		List<Cliente> clientes = queryResult.getResultList();
		return clientes;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listar2() {
		Query queryResult = entityManager.createQuery("SELECT c FROM Cliente c");
		List<Cliente> clientes = queryResult.getResultList();
		return clientes;
	}
	
	public List<Pedido> listar3() {
		Query queryResult = entityManager.createNamedQuery("Pedido.findAll");
		List<Pedido> pedidos = queryResult.getResultList();
		return pedidos;
	}
	
	public List<Produto> listar4() {
		String query = "SELECT p FROM Produto p";
		TypedQuery<Produto> queryResult =  entityManager.createQuery(query,Produto.class);
		List<Produto> produtos = queryResult.getResultList();
		return produtos;
	}
	
	public long listar5() {
		String query = "SELECT COUNT(p) FROM Pedido p";
		TypedQuery<Long> queryResult =  entityManager.createQuery(query,Long.class);
		long qtdPedidos = queryResult.getSingleResult();
		return qtdPedidos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listar6() {
		StoredProcedureQuery queryResult = entityManager.createNamedStoredProcedureQuery("AumentarPrecos");
		queryResult.setParameter("PERCENTUAL_PRECO", 1.20);
		queryResult.execute();
		List<Produto> produtos = entityManager.createNamedQuery("Produto.findAll").getResultList();
		return produtos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Pedido> listar7() {
		Query queryResult = entityManager.createQuery("SELECT p FROM Pedido p WHERE p.status <> :status");
		queryResult.setParameter("status", StatusPedido.EM_ANALISE_FINANCEIRO);
		List<Pedido> pedidos = queryResult.getResultList();
		return pedidos;
	}
	
	
	public List<Produto> listar8() {
		String query = "SELECT p FROM Produto p WHERE p.preco > 20";
		TypedQuery<Produto> queryResult =  entityManager.createQuery(query,Produto.class);
		List<Produto> produtos = queryResult.getResultList();
		return produtos;
	}
	
	@SuppressWarnings("unchecked")
	public List<Pedido> listar9() {
		Query queryResult = entityManager.createQuery("SELECT p FROM Pedido p WHERE p.status = :status");
		queryResult.setParameter("status", StatusPedido.EM_EMBARQUE);
		List<Pedido> pedidos = queryResult.getResultList();
		return pedidos;
	}
	
	@SuppressWarnings("deprecation")
	public List<Pedido> listar10() {
		Query queryResult = entityManager.createQuery("SELECT p FROM Pedido p WHERE p.data_pedido > :data_pedido");
		queryResult.setParameter("data_pedido", new Date("19/09/2017"));
		List<Pedido> pedidos = queryResult.getResultList();
		return pedidos;
	}
	
}
