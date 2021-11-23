package com.spring.service;

import java.util.List;

import com.spring.entity.Profile;

public interface ProfileService {
	
	public List<Profile> getProfiles();
	
	public Profile getProfile(long profileId);
	
	public Profile addProfile(Profile profile);
	
	public void deleteProfile(long profileId);
	

}
