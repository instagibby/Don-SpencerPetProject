package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Don Erickson
 * Spencer Davis
 * CIS 175 Java II 
 * Pet Project using .gitignore file
 */

@Entity
@Table(name = "owners")
public class Owners {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OWNERS_ID")
	private int ownersId;
	@Column(name="NAME")
	private String name;
	
	//default no args
	public Owners() {
		super();
	}
	
	
	public Owners(int ownersName, String name) {
		super();
		this.name = name;
		this.ownersId = ownersName;
	}


	public int getOwnersId() {
		return ownersId;
	}


	public void setOwnersId(int ownersId) {
		this.ownersId = ownersId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//getters and setters
	
	
	
	
}
