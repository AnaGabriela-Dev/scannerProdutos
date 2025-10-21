package atividade5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private LocalDate data;
	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();;
	private IPagamento metodoPagamento;
	private StatusPedido statusPedido = StatusPedido.PENDENTE;
	
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(ItemPedido item) {
		for(int i = 0; i < this.itens.size(); i++) {
			if (item.getProduto().getNome().equalsIgnoreCase(this.itens.get(i).getProduto().getNome()) && item.getProduto().getPreco() == this.itens.get(i).getProduto().getPreco()) {
				this.itens.get(i).setQuatidade(this.itens.get(i).getQuatidade() + item.getQuatidade());
				return;
			}
		}
		this.itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		for(int i = 0; i < this.itens.size(); i++) {
			if (item == this.itens.get(i)) {
				this.itens.remove(i);
				return;
			}
		}
		System.out.println("Produto não encontrado no carrinho!");
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i = 0; i < itens.size(); i++) {
			total += this.itens.get(i).getSubTotal();
		}
		return total;
	}
	
	public double aplicarDesconto(double desconto) {
		return calcularTotal() * desconto;
	}
	
	public boolean confirmaPedido() {
		if (statusPedido == StatusPedido.PENDENTE || metodoPagamento == null) {
			return false;
		}
		if(metodoPagamento.processarPagamento(this.calcularTotal())) {
			statusPedido = StatusPedido.PROCESSANDO;
			System.out.println("O pagamento está sendo processado...");
		}
		return metodoPagamento.processarPagamento(this.calcularTotal());
	}
	
	public void exibirCarrinho() {
		System.out.printf("====== CARRINHO DE %s ======\n", cliente.getNome().toUpperCase());
		for(int i = 0; i < itens.size(); i++) {
			System.out.printf("Nome produto: %s\n", itens.get(i).getProduto().getNome());
			System.out.printf("Preço: R$%.2f\n", itens.get(i).getProduto().getPreco());
			System.out.printf("Quantidade: %d\n", itens.get(i).getQuatidade());
			System.out.printf("Valor total: R$%.2f\n\n", itens.get(i).getSubTotal());
		}
		System.out.printf("Total carrinho: R$%.2f\n\n", calcularTotal());
	}
	// === GET & SET ====
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public IPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(IPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
