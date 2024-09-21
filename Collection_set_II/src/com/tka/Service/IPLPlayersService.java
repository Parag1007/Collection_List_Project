package com.tka.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.tka.Dao.IPLPlayerDao;
import com.tka.entity.Players;

public class IPLPlayersService {

	IPLPlayerDao Dao = null;

	public Set<Players> GetAllPlayersService() {
		// Set<Players> P1= new HashSet<Players>();
		Dao = new IPLPlayerDao();
		// System.out.println("IPLPlayersService ->GetAllPlayersService ");

		Set<Players> PlayerDB = Dao.GetAllPlayer();

		return PlayerDB;

	}

	public Set<Players> GetPlayerFromJno(int Jno) {
		Set<Players> db2 = new HashSet<Players>();
		Dao = new IPLPlayerDao();

		Set<Players> PlayerDB = Dao.GetAllPlayer();
		for (Players p : PlayerDB) {

			if (p.getJersyno() == Jno) {

				db2.add(p);

			}

		}
		return db2;

	}
//
//	public Set<Players> GetPlayerFromJno(int jno) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Set<Players> GetPlayersWhoseWicketlessThanService(int w) {
		Set<Players> db3 = new HashSet<Players>();

		Dao = new IPLPlayerDao();
		Set<Players> db = Dao.GetAllPlayer();
		for (Players ww : db) {

			if (ww.getWicket() < w) {

				db3.add(ww);

			}

		}

		return db3;
	}

	public Set<Players> PlayersWhoseRunsGreaterThanService(int r) {

		Set<Players> db4 = new HashSet<Players>();
		Dao = new IPLPlayerDao();
		Set<Players> db = Dao.GetAllPlayer();
		for (Players runs : db) {
			if (runs.getRuns() >= r) {

				db4.add(runs);

			}

		}

		return db4;
	}

	public Set<Players> PlayersWhoseRunslessThanService(int runs) {

		Set<Players> db6 = new HashSet<Players>();
		Dao = new IPLPlayerDao();

		Set<Players> Playerdb = Dao.GetAllPlayer();
		for (Players R : Playerdb) {
			if (R.getRuns() < runs) {

				db6.add(R);
			}

		}

		return db6;
	}

	public Set<Players> FindPlayersUsingTeamNameService(String Team) {

		Set<Players> db6 = new HashSet<Players>();
		Dao = new IPLPlayerDao();
		Set<Players> Playerdb = Dao.GetAllPlayer();
		for (Players t : Playerdb) {

			if (t.getTeam_name().equalsIgnoreCase(Team)) {

				db6.add(t);

			}

		}
		return db6;
	}
     
 	public TreeSet<Players> SortPlayerAssendingRuns(){
 		
 		Set<Players> db6 = new TreeSet<Players>();
		Dao = new IPLPlayerDao();
		Set<Players> Playerdb = Dao.GetAllPlayer();
		


		return null;
 		
 	}
}
