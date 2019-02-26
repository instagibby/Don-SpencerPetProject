package model;
/*
 * Don Erickson
 * Spencer Davis
 * CIS 175 Java II 
 * Pet Project using .gitignore file
 */

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import javax.persistence.Table;


@Entity 
@Table(name = "pets")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PET_ID")
	private int petId;
	@Column(name="PET_NAME")
	private String petName;
	@Column(name="PET_BREED")
	private String petBreed;
	@Column(name="GOTCHA_DATE")
	private LocalDate gotchaDate;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "OWNERS_ID")
	private Owners owners;
	
	//default no arg
	public Pets() {
		super();
	}
	
	//all the args we could ever want
	public Pets(int petId, String petName, String petBreed, LocalDate gotchaDate, Owners owners) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petBreed = petBreed;
		this.gotchaDate = gotchaDate;
		this.owners = owners;
	}
	
	//constructor for auto_incremented ids and owner info later
	public Pets(String petName, String petBreed, LocalDate gotchaDate) {
		super();
		this.petName = petName;
		this.petBreed = petBreed;
		this.gotchaDate = gotchaDate;
	}

	//getters and setters
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public LocalDate getGotchaDate() {
		return gotchaDate;
	}
	public void setGotchaDate(LocalDate gotchaDate) {
		this.gotchaDate = gotchaDate;
	}
	public Owners getOwners() {
		return owners;
	}
	public void setOwners(Owners owners) {
		this.owners = owners;
	}


	@Override
	public String toString() {
		return "Pets [petName=" + petName + ", petBreed=" + petBreed + ", gotchaDate=" + gotchaDate + ", owners="
				+ owners + "]";
	}
	
	
	
}
