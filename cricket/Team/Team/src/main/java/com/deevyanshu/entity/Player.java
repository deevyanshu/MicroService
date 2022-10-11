package com.deevyanshu.entity;

public class Player {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String playerType;
	
	private double biddingAmount;
	
	private int tid;
	
	private String teamName;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	

	public int getTid() {
		return tid;
	}



	public void setTid(int tid) {
		this.tid = tid;
	}



	public Player(String name, int age, String playerType, double biddingAmount, int tid,String teamName) {
		super();
		this.name = name;
		this.age = age;
		this.playerType = playerType;
		this.biddingAmount = biddingAmount;
		this.tid = tid;
		this.teamName=teamName;
	}



	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", playerType=" + playerType
				+ ", biddingAmount=" + biddingAmount + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public double getBiddingAmount() {
		return biddingAmount;
	}

	public void setBiddingAmount(double biddingAmount) {
		this.biddingAmount = biddingAmount;
	}



	public String getTeamName() {
		return teamName;
	}



	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
	

}
