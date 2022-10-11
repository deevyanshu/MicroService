package com.deevyanshu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.deevyanshu.entity.College;
import com.deevyanshu.entity.CollegeDetails;
import com.deevyanshu.entity.Student;
import com.deevyanshu.repository.CollegeRepository;

@Service
public class CollegeService {
	
	@Autowired
	private CollegeRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<CollegeDetails> getAll()
	{
		List<College> list=repository.findAll();
		List<CollegeDetails> cl=new ArrayList<>();
		for(College c:list)
		{
			CollegeDetails cd=new CollegeDetails();
			cd.setId(c.getId());
			BeanUtils.copyProperties(c, cd);
			cd.setStudents(restTemplate.getForObject("http://student-service/api/v1/student/college/"+c.getId(), List.class));
			cl.add(cd);
		}
		return cl;
	}
	
	public String getCollegeName(int id)
	{
		College cl=repository.findById(id).get();
		return cl.getName();
	}
	
	public CollegeDetails add(College cl)
	{
		repository.save(cl);
		CollegeDetails cd=new CollegeDetails();
		cd.setId(cl.getId());
		cd.setName(cl.getName());
		return cd;
	}
	
	public CollegeDetails getCollege(int id)
	{
		College cl=repository.findById(id).get();
		CollegeDetails cd=new CollegeDetails();
		cd.setId(cl.getId());
		cd.setName(cl.getName());
		cd.setStudents(restTemplate.getForObject("http://student-service/api/v1/student/college/"+cl.getId(), List.class));
		return cd;
	}
	
	public Student addStudent(Student stud,int cid)
	{
		return restTemplate.postForObject("http://student-service/api/v1/student/add/"+cid, stud, Student.class); 
	}

}
