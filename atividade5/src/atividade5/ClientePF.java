package atividade5;

import java.time.LocalDate;

public class ClientePF extends Cliente{
	private String cpf;
	private LocalDate dataNascimento;
	
	
	public ClientePF(String nome) {
		super(nome);
	}
	
	@Override
	public String getIdentificadorUnico() {
		return null;
	}
	
	// === GET&SET ===

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
