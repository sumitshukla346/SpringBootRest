package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProfileDao;
import com.spring.entity.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileDao profileDao;

	@Override
	public List<Profile> getProfiles() {
		
		return profileDao.findAll();
	}

	@Override
	public Profile addProfile(Profile profile) {
		
		return profileDao.save(profile);
	}

	@Override
	public Profile getProfile(long profileId) {
		// TODO Auto-generated method stub
		return profileDao.getById(profileId);
	}

	@Override
	public void deleteProfile(long profileId) {
		// TODO Auto-generated method stub
		Profile entity = profileDao.getById(profileId);
		profileDao.delete(entity);
	}

}
