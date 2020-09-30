package br.com.email.mensagex.entity;

public class Email {

	String descricao;

	public Email() {
		
	}
	
	public Email(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}