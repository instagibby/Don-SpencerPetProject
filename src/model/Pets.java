package model;
/*
 * Don Erickson
 * Spencer Davis
 * CIS 175 Java II 
 * Pet Project using .gitignore file
 */

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Date gotchaDate;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "OWNER_ID")
	private Owners ownerId;
	
	//default no arg
	public Pets() {
		super();
	}
	
	//all the args we could ever want
	public Pets(int petId, String petName, String petBreed, Date gotchaDate, Owners owners) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petBreed = petBreed;
		this.gotchaDate = gotchaDate;
		this.ownerId = owners;
	}
	
	//constructor for auto_incremented ids and owner info later
	public Pets(String petName, String petBreed, Date gotchaDate, Owners owner) {
		super();
		this.petName = petName;
		this.petBreed = petBreed;
		this.gotchaDate = gotchaDate;
		this.ownerId = owner;
		
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
	public Date getGotchaDate() {
		return gotchaDate;
	}
	public void setGotchaDate(Date gotchaDate) {
		this.gotchaDate = gotchaDate;
	}
	public Owners getOwners() {
		return ownerId;
	}
	public void setOwners(Owners owner) {
		this.ownerId = owner;
	}


	@Override
	public String toString() {
		return "Pets [petName=" + petName + ", petBreed=" + petBreed + ", gotchaDate=" + gotchaDate + ", owner="
				+ ownerId + "]";
	}
	
	
	
}
