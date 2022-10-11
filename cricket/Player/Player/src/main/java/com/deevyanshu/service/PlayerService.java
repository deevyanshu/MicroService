package com.deevyanshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deevyanshu.entity.Player;
import com.deevyanshu.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Player> getPlayers()
	{
		return repository.findAll();
	}
	
	public Player addPlayer(Player player,int tid)
	{
		player.setTid(tid);
		player.setTeamName(restTemplate.getForObject("http://team-service/api/v1/team/name/"+tid, String.class));
		return repository.save(player);
	}
	
	public Player updateBidding(Player player,int id)
	{
		Player pl=repository.findById(id).get();
		pl.setBiddingAmount(player.getBiddingAmount());
		return repository.save(pl);
	}
	
	public List<Player> getPlayerByTeamId(int tid)
	{
		return repository.getPlayerByTeamId(tid);
	}
	

}
