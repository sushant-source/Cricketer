package com.sushant.services;

import java.util.List;

import com.sushant.entity.Match;

public interface MatchService {

//	Get all matches
	
	List<Match> getAllMatches();
	
//	Get live matches
	
	List<Match> getLiveMatches();
	
//	Get WC 2023 Points Table
	
	List<List<String>> getPointTable();
}
