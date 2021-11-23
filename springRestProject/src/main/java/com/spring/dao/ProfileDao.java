package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Profile;

public interface ProfileDao extends JpaRepository<Profile, Long> {

}
