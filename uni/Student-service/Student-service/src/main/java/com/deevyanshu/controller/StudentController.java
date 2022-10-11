package com.deevyanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.entity.Student;
import com.deevyanshu.service.StudentService;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/all")
	public List<Student> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") int id)
	{
		return service.getStudent(id);
	}
	
	@PostMapping("/add/{cid}")
	public Student addStudent(@RequestBody Student stud,@PathVariable("cid")int cid)
	{
		return service.add(stud,cid);
	}
	
	@GetMapping("/college/{cid}")
	public List<Student> getStudentByCollege(@PathVariable("cid")int cid)
	{
		return service.getStudentByCollege(cid);
	}
	
	
}
