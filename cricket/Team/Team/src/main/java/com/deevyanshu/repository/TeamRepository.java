package com.deevyanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deevyanshu.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{

	@Query(value = "select * from Team where name=:name",nativeQuery = true)
	public Team getTeamByName(@Param("name") String name);
}
