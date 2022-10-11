package com.deevyanshu.entity;

import java.util.List;

public class TeamDetails {
	private int id;
	
	private String name;
	
	private double budget;
	
	private List<Player> players;
	
	public TeamDetails() {
		// TODO Auto-generated constructor stub
	}

	public TeamDetails(String name, double budget, List<Player> players) {
		super();
		this.name = name;
		this.budget = budget;
		this.players = players;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "TeamDetails [id=" + id + ", name=" + name + ", budget=" + budget + ", players=" + players + "]";
	}
	
	

}
