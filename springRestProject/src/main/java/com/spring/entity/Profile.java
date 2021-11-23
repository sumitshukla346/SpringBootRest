package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profile {
	
	@Id
	private long profileId;
	private String name;
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(long profileId, String name) {
		super();
		this.profileId = profileId;
		this.name = name;
	}
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + "]";
	}
	
	

}
