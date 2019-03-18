package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Pets;

public class petHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Don-SpencerPetProject");

	public void insertPet(Pets p) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}

	public List<Pets> showAllPets() {
		EntityManager em = emfactory.createEntityManager();
		List<Pets> allPets = em.createQuery("SELECT i FROM Pets i").getResultList();
		return allPets;
	}

	public void deletePet(Pets toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pets> typedQuery = em.createQuery(
				"select c from Pets c where c.petName = :selectedName and c.petBreed = :selectedBreed and c.gotchaDate = :selectedDate", Pets.class);
		// Substitute parameter with actual data from the toDelete item
		typedQuery.setParameter("selectedName", toDelete.getPetName());
		typedQuery.setParameter("selectedBreed", toDelete.getPetBreed());
		typedQuery.setParameter("selectedDate", toDelete.getGotchaDate());
		// we only want one result
		typedQuery.setMaxResults(1);
		// get the result and save it into a new list item
		Pets result = typedQuery.getSingleResult();
		// remove it
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public List<Pets> searchForPetByName(String name) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pets> typedQuery = em.createQuery("select c from Pets c where c.name = :selectedPet", Pets.class);
		typedQuery.setParameter("selectedPet", name);
		List<Pets> foundPets = typedQuery.getResultList();
		em.close();
		return foundPets;
	}

	public List<Pets> searchForPetByBreed(String petBreed) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pets> typedQuery = em.createQuery("select c from Pets c where c.breed = :selectedPet", Pets.class);
		typedQuery.setParameter("selectedPet", petBreed);
		List<Pets> foundPets = typedQuery.getResultList();
		em.close();
		return foundPets;
	}

	public Pets searchForPetById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Pets found = em.find(Pets.class, idToEdit);
		em.close();
		return found;
	}

	public void updatePet(Pets toEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
	}

	public void cleanUp() {
		emfactory.close();
	}

}
