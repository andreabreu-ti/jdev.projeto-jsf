package br.com.jdev.projeto_jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBen")
public class PessoaBen {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;

	public String mostraNome() {
		nomeCompleto = nome + " " + sobrenome;
		return "";
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}