package atividade5;

public class ItemPedido {
	private Produto produto;
	private int quantidade;
	private double precoUnitario;
	
	public ItemPedido(String nome, double preco, String id, int estoque, String descricao, int quant) {
		Produto produto = new Produto(id, nome, preco, estoque, descricao); 
		this.produto = produto;
		this.quantidade = quant;
	}
	
	public double getSubTotal() {
		double total = 0;
		total += this.produto.getPreco() * quantidade;
		return total;
	}
	
	// === GET & SET ====
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuatidade() {
		return quantidade;
	}
	public void setQuatidade(int quatidade) {
		this.quantidade = quatidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}
