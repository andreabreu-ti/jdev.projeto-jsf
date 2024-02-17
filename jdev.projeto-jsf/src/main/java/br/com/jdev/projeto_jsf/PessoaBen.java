package br.com.jdev.projeto_jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ViewScoped
@ManagedBean(name = "pessoaBen")
public class PessoaBen {

	private String nome;

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
