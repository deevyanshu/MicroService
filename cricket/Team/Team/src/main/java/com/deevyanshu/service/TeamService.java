package com.deevyanshu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deevyanshu.entity.Player;
import com.deevyanshu.entity.Team;
import com.deevyanshu.entity.TeamDetails;
import com.deevyanshu.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public List<TeamDetails> getTeams()
	{
		List<Team> teams=repository.findAll();
		List<TeamDetails> list=new ArrayList<>();
		for(Team t:teams)
		{
			TeamDetails td=new TeamDetails();
			BeanUtils.copyProperties(t, td);
			td.setId(t.getId());
			td.setPlayers(restTemplate.getForObject("http://player-service/api/v1/player/team/"+t.getId(), List.class));
			list.add(td);
		}
		return list;
	}
	
	public List<Player> getPlayers(String teamName)
	{
		Team team=repository.getTeamByName(teamName);
		
		TeamDetails td=new TeamDetails();
		
		BeanUtils.copyProperties(team, td);
		td.setId(team.getId());
		td.setPlayers(restTemplate.getForObject("http://player-service/api/v1/player/team/"+team.getId(), List.class));
		return td.getPlayers();
	}
	
	public TeamDetails addTeam(Team team)
	{
		repository.save(team);
		TeamDetails td=new TeamDetails();
		BeanUtils.copyProperties(team, td);
		td.setId(team.getId());
		return td;
	}
	
	public String teamName(int id)
	{
		Team team=repository.findById(id).get();
		return team.getName();
	}
}
