package br.com.iw.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.iw.entity.Lancamento;

@Named
@RequestScoped
public class ConsultaLancamentoBean {

	private Lancamento[] lancamentos = new Lancamento[20];
	
	@PostConstruct
	public void inicializar() {
		Lancamento lancamento;
		boolean flag = true;		
		for (int i = 0; i < 20; i++) {
			if (flag) {
				lancamento = new Lancamento();
				lancamento.setTipo("Receita");
				lancamento.setPessoa("Pessoa Física");
				lancamento.setValor(2000.00);
				lancamento.setDescricao("Prestador de Serviços");
				lancamento.setDataPagamento(new Date());
				lancamento.setDataVencimento(new Date());
				lancamentos[i] = lancamento;
				flag = false;
			} else {
				lancamento = new Lancamento();
				lancamento.setTipo("Despesa");
				lancamento.setPessoa("Pessoa Jurídica");
				lancamento.setValor(1000.00);
				lancamento.setDescricao("Fornecedor de Equipamentos");
				lancamento.setDataPagamento(new Date());
				lancamento.setDataVencimento(new Date());
				lancamentos[i] = lancamento;
				flag = true;
			}
			
		}
	}

	public Lancamento[] getLancamentos() {
		return lancamentos;
	}
	
}