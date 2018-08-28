package br.unipe.danillo.java.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.danillo.java.web.entidades.Cliente;

public class ListaCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
				
		
		Query query = manager.createQuery("SELECT * FROM CLIENTE c", Cliente.class);
		List<Cliente> lista = query.getResultList();
		
		for(Cliente c : lista)		
		System.out.println(c);
		
		manager.close();
		factory.close();
		
		
		
	}

}
