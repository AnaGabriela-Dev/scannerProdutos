package atividade5;

public abstract class Cliente {
	protected String nome;
	protected String email;
	protected String id;
	protected String telefone;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public abstract String getIdentificadorUnico();
	
	// === GET & SET ===
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
