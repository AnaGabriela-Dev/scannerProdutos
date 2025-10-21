package atividade5;

public interface IPagamento {
	public boolean processarPagamento(double pagamento);
	public StatusPagamento getStatus();
}
