package com.tka.Dao;

import java.util.HashSet;
import java.util.Set;

import com.tka.entity.Players;

public class IPLPlayerDao {

	//IPLPlayerDao Dao = null;

	public Set<Players> GetAllPlayer() {

		//System.out.println("IPLPlayerDao ->GetAllPlayer");

		Set<Players> db = new HashSet<Players>();
		db.add(new Players(7, "msd",  6, 13000, "CSK"));
		db.add(new Players(1, "Rahul", 10, 5000, "Lakhanau"));
		db.add(new Players(9, "Raina", 5, 5000, "Pune"));
		db.add(new Players(5, "Sachin", 4, 10000, "Mumbai"));
		db.add(new Players(18, "Kohli", 11, 15000, "RCB"));

		return db;
	}

}
