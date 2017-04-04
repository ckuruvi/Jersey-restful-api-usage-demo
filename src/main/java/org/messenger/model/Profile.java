package org.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private String profileName;
	private String lastName;
	private String firstName;
	private Date created;
	
	public Profile(){}
	
	

	public Profile(String profileName, String lastName, String firstName) {
		super();
		this.profileName = profileName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.created = new Date();
	}



	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
}
