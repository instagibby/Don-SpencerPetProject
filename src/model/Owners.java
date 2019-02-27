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
	@Column(name="OWNERS_NAME")
	private String ownersName;
	
	//default no args
	public Owners() {
		super();
	}
	
	//constructor one arg, as the ID is auto-increment
	public Owners(String ownersName) {
		super();
		this.ownersName = ownersName;
	}
	
	//getters and setters
	public int getOwnersId() {
		return ownersId;
	}
	public void setOwnersId(int ownersId) {
		this.ownersId = ownersId;
	}
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	
	
}
