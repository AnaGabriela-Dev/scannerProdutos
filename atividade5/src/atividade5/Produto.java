package atividade5;

public class Produto {
	protected String nome;
	protected double preco;
	protected int estoque;
	protected String id;
	protected String descricao;
	
	public Produto(String id, String nome, double preco, int estoque, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
		this.descricao = descricao;
	}
	
	public void addEstoque(int valor) {
		this.estoque += valor;
	}
	
	public void exibirProduto() {
		System.out.println("================================");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preco: R$" + this.preco);
		System.out.println("Estoque: " + this.estoque);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("================================");
	}
	
	// === GET & SET ====
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
