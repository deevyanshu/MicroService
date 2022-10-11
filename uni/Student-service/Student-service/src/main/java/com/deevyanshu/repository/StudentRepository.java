package com.deevyanshu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deevyanshu.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query(value = "select * from Student where cid=:cid",nativeQuery = true)
	public List<Student> getStudentByCollege(@Param("cid") int cid);
}
