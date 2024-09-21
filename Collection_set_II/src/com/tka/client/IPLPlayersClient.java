package com.tka.client;

import java.util.HashSet;
import java.util.Set;

import com.tka.Controller.IPLPlayersController;
import com.tka.Service.IPLPlayersService;
import com.tka.entity.Players;

public class IPLPlayersClient {

	public static void main(String[] args) {

		IPLPlayersController Player = new IPLPlayersController();
		Set<Players> p = Player.IPLPlayersControllers();
		System.err.println("\n\t  All Players List: \n");
		for (Players players : p) {
			System.out.println(players);

		}
//
		Set<Players> p1 = Player.PlayersWithJnoController(7);
		System.out.println("\n***************************************************************");
		System.err.println("\n\t  Find Player Using Jno: ");
		System.out.println(p1);

		Set<Players> w = Player.PlayersWhoseWicketsLessThanController(10);
		System.out.println("\n***************************************************************");
		System.err.println("\n\t Whose wickets less than:\n");
		for (Players ww : w) {
			System.out.println(ww);
//
		}
		Set<Players> r = Player.PlayersWhoseRunsGreaterThanController(10000);
		System.out.println("\n*******************************************************************");
		System.err.println("\n\tGreater than 10000 or euqal Runs\n");
		for (Players greaterRuns : r) {
			System.out.println(greaterRuns);
//
	}
//
		Set<Players> R = Player.PlayersWhoseRunslessThanController(10000);
		System.out.println("\n*******************************************************************");
		System.err.println("\n\t Get Players whose Runs Less Than ");
		for (Players rr : R) {
			System.out.println(rr);
		}
//
		Set<Players> T = Player.FindPlayersUsingTeamNameontroller("RcB");
		System.out.println("\n***************************************************************");
		System.err.println("\n\t  Player Get By using Team Name: ");
		System.out.println(T);
//
		
	}
	

}
