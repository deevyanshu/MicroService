package com.deevyanshu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deevyanshu.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}
