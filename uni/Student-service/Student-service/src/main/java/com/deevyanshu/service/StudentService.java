package com.deevyanshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deevyanshu.entity.Student;
import com.deevyanshu.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Student> getAll()
	{
		return repository.findAll();
	}
	
	public Student getStudent(int id)
	{
		return repository.findById(id).get();
	}
	
	public Student add(Student stud,int cid)
	{
		stud.setCid(cid);
		stud.setCollege(restTemplate.getForObject("http://college-service/api/v1/college/name/"+cid, String.class));
		return repository.save(stud);
	}
	
	public List<Student> getStudentByCollege(int cid)
	{
		return repository.getStudentByCollege(cid);
	}
	
	

}
