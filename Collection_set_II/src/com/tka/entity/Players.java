package com.tka.entity;

public class Players {
	
	private int Jersyno;
	private String name;
	private int Wicket;
	private int runs;
	private String team_name;
	public Players() {
		super();
	}
	public Players(int jersyno, String name, int wicket, int runs, String team_name) {
		super();
		Jersyno = jersyno;
		this.name = name;
		Wicket = wicket;
		this.runs = runs;
		this.team_name = team_name;
	}
	public int getJersyno() {
		return Jersyno;
	}
	public void setJersyno(int jersyno) {
		Jersyno = jersyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWicket() {
		return Wicket;
	}
	public void setWicket(int wicket) {
		Wicket = wicket;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	@Override
	public String toString() {
		return "IPLPlayers [Jersyno=" + Jersyno + ", name=" + name + ", Wicket=" + Wicket + ", runs=" + runs
				+ ", team_name=" + team_name + "]";
	}
	
	

}
