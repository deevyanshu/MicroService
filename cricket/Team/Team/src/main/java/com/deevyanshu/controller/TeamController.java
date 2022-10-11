package com.deevyanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.entity.Player;
import com.deevyanshu.entity.Team;
import com.deevyanshu.entity.TeamDetails;
import com.deevyanshu.service.TeamService;

@RestController
@RequestMapping("api/v1/team")
public class TeamController {
	
	@Autowired
	private TeamService service;
	
	@GetMapping("/all")
	public List<TeamDetails> getTeams()
	{
		return service.getTeams();
	}
	
	@PostMapping("/add")
	public TeamDetails addTeam(@RequestBody Team team)
	{
		return service.addTeam(team);
	}
	
	@GetMapping("/players/{name}")
	public List<Player> getPlayersByTeam(@PathVariable("name") String name)
	{
		return service.getPlayers(name);
	}
	
	@GetMapping("/name/{id}")
	public String getTeamName(@PathVariable("id")int id)
	{
		return service.teamName(id);
	}

}
