package com.mcnz.rps.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreService {
	
	
	public static Score score = new Score();
	
	@RequestMapping(value="/score/wins", method=RequestMethod.GET)
	public int getWins() { return score.getWins();}

	@RequestMapping(value="/score/ties", method=RequestMethod.GET)
	public int getTies() { return score.getTies();}

	@RequestMapping(value="/score/losses", method=RequestMethod.GET)
	public int getLosses() { return score.getLosses();}

	@RequestMapping(value="/score/wins", method=RequestMethod.POST)

	public int increaseWins() { return ++score.wins; }
	
	@RequestMapping(value="/score/ties", method=RequestMethod.POST)
	public int increaseTies() { return ++score.ties; }
	
	@RequestMapping(value="/score/losses", method=RequestMethod.POST)
	public int increaseLosses() { return ++ score.losses; }
	
	@RequestMapping(value="/score/reset", method=RequestMethod.PUT)
	public void reset() {
		score.wins = score.ties = score.losses = 0;
	}
	
	@RequestMapping(value="/score", method=RequestMethod.GET, 
			produces="application/json")
	public Score getScore() {
		return score;
	}
	

	

}
