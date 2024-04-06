package com.sushant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushant.entity.Match;
import com.sushant.services.MatchService;

@RestController
@RequestMapping("/match")
public class MatchController {

	@Autowired
	private MatchService matchService;
	
	public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}
	
//	Get live match
	
	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	}

//	Get live match
	
	@GetMapping("/all")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	}
	
//	Get point-table
	
	@GetMapping("/point-table")
	public ResponseEntity<?> getPointTable(){
		return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	}
}
