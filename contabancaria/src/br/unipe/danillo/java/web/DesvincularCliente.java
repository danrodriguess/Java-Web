package br.unipe.danillo.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DesvincularCliente {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();		

	}

}
