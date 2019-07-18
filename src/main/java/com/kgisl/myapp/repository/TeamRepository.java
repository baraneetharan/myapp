package com.kgisl.myapp.repository;

import com.kgisl.myapp.entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TeamRepository
 */
public interface TeamRepository extends JpaRepository<Team,Long>{

    
}