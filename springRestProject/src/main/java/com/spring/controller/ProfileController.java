package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Profile;
import com.spring.service.ProfileService;

@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	
	@GetMapping("/profiles")
	public List<Profile> getProfiles(){
		
		return this.profileService.getProfiles();
	}
	
	@GetMapping("/profiles/{profileId}")
	public Profile getProfile(@PathVariable String profileId) {
		
		return this.profileService.getProfile(Long.parseLong(profileId));
	}
	
	@PostMapping("/profile")
	public Profile addProfile(@RequestBody Profile profile) {
		
		return this.profileService.addProfile(profile);
		
	}
	
	@DeleteMapping("/profiles/{profileId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long profileId){
		
		try {
			this.profileService.deleteProfile(profileId);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
