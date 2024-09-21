package com.tka.Controller;

import java.util.HashSet;
import java.util.Set;

import com.tka.Dao.IPLPlayerDao;
import com.tka.Service.IPLPlayersService;
import com.tka.entity.Players;

public class IPLPlayersController {

	IPLPlayersService service = null;

	public Set<Players> IPLPlayersControllers() {
		// Set<Players> P1= new HashSet<Players>();
		service = new IPLPlayersService();

		System.out.println("IPLPlayersController ->IPLPlayersController ");
		Set<Players> PlayerDb = service.GetAllPlayersService();

		return PlayerDb;

	}

	public Set<Players> PlayersWithJnoController(int Jno) {
		// Set<Players> P1= new HashSet<Players>();
		service = new IPLPlayersService();

		// System.out.println("IPLPlayersController ->IPLPlayersController ");
		Set<Players> PlayerDb = service.GetPlayerFromJno(Jno);

		return PlayerDb;

	}

	public Set<Players> PlayersWhoseWicketsLessThanController(int w) {

		service = new IPLPlayersService();
		Set<Players> Playerdb = service.GetPlayersWhoseWicketlessThanService(w);
		return Playerdb;
	}
	
	public Set<Players>PlayersWhoseRunsGreaterThanController(int r){
		service = new IPLPlayersService();
		Set<Players> Playerdb= service.PlayersWhoseRunsGreaterThanService(r);
		return Playerdb;
		
		
	}
	public Set<Players>PlayersWhoseRunslessThanController(int runs){
		service = new IPLPlayersService();
		Set<Players> Playerdb= service.PlayersWhoseRunslessThanService(runs);
		return Playerdb;
	}
	
	public Set<Players>FindPlayersUsingTeamNameontroller(String Team){
		
	service= new IPLPlayersService();
	Set<Players> playersdb= service.FindPlayersUsingTeamNameService(Team);
		
		return playersdb;
		
	}
}







