package atividade5;

import java.time.LocalDate;

public class PagamentoBoleto implements IPagamento{
	private String codigoBarras;
	private LocalDate dataVencimento;
	private double valor;
	private StatusPagamento statusPagamento;
	
	@Override
	public boolean processarPagamento(double pagamento) {
		System.out.println("Processando pagamento...\n");
		statusPagamento = StatusPagamento.APROVADO;
		return true;
	}
	
	@Override
	public StatusPagamento getStatus() {
		return statusPagamento;
	}
	
	// === GET & SET ===
	public void setCodigoBarras(String codigo) {
		this.codigoBarras = codigo;
	}
	
	public String getCodigoBarras() {
		return this.codigoBarras;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
