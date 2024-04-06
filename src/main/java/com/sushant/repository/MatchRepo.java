package com.sushant.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushant.entity.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {

//	Getting Match Detail by MatchHeading
	
	Optional<Match> findByTeamHeading(String teamHeading);
}
