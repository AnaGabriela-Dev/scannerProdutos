package atividade5;

import java.time.LocalDate;

public class PagamentoCartaoCredito implements IPagamento{
	private String numeroCartao;
	private String nomeTitular;
	private LocalDate dataValidade;
	private StatusPagamento statusPagamento;
	
	@Override
	public boolean processarPagamento(double pagamento) {
		if (pagamento < 5000) {
			statusPagamento = StatusPagamento.APROVADO;
			System.out.printf("Pagamento aprovado!\n\n");
			return true;
		} else {
			statusPagamento = StatusPagamento.RECUSADO;
			System.out.printf("Pagamento recusado!\n\n");
			return false;
		}
	}
	
	@Override
	public StatusPagamento getStatus() {
		return statusPagamento;
	}
	
	// === GET & SET ====
	public void setNumeroCartao(String numero) {
		this.numeroCartao = numero;
	}
	
	public String getNumeroCartao() {
		return this.numeroCartao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
}
