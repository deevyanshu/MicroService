package com.deevyanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.entity.Player;
import com.deevyanshu.service.PlayerService;

@RestController
@RequestMapping("api/v1/player")
public class PlayerController {

	@Autowired
	private PlayerService service;
	
	@GetMapping("/all")
	public List<Player> getPlayers()
	{
		return service.getPlayers();
	}
	
	@PostMapping("/add/{tid}")
	public Player add(@RequestBody Player player,@PathVariable("tid") int tid)
	{
		return service.addPlayer(player, tid);
	}
	
	@PutMapping("/update/{id}")
	public Player updateBidding(@RequestBody Player player,@PathVariable("id") int id)
	{
		return service.updateBidding(player, id);
	}
	
	@GetMapping("/team/{tid}")
	public List<Player> getPlayerByTeamId(@PathVariable("tid") int tid)
	{
		return service.getPlayerByTeamId(tid);
	}
	
}
