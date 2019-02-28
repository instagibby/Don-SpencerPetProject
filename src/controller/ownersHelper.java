package controller;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Owners;

public class ownersHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Don-SpencerPetProject");

	public void insertOwner(Owners o) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
	}
	


	public List<Owners> showAllOwners() {
		EntityManager em = emfactory.createEntityManager();
		List<Owners> allOwners = em.createQuery("SELECT i FROM owners i ").getResultList();
		return allOwners;
	}
	
	

}
