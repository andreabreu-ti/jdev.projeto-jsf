package br.com.jdev.projetojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean(name = "pessoaBen")
public class PessoaBen {

	private String nome;

	private String senha;

	private String texto;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	private HtmlCommandButton htmlCommandButton;

	private List<String> nomes = new ArrayList<String>();

	public HtmlCommandButton getHtmlCommandButton() {
		return htmlCommandButton;
	}

	public void setHtmlCommandButton(HtmlCommandButton htmlCommandButton) {
		this.htmlCommandButton = htmlCommandButton;
	}

	public String addNome() {
		nomes.add(nome);

		if (nomes.size() > 3) {
			htmlCommandButton.setDisabled(true);

			return "paginanavegada?faces-redirect=true";
		}

		return "";
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
