package com.deevyanshu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deevyanshu.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	@Query(value = "select * from Player where tid=:tid",nativeQuery = true)
	public List<Player> getPlayerByTeamId(@Param("tid") int tid);

}
