package atividade5;

public class ClientePJ extends Cliente{
	private String cnpj;
	private String razaoSocial;
	private String inscricaoEstadual;
	
	public ClientePJ(String nome) {
		super(nome);
	}
	
	@Override
	public String getIdentificadorUnico() {
		return null;
	}
	
	// === GET&SET ===

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
