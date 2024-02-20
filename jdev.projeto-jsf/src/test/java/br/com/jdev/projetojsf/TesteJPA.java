package br.com.jdev.projetojsf;

import javax.persistence.Persistence;

public class TesteJPA {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("jdev.projeto-jsf");
	}

}
