package com.deevyanshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deevyanshu.entity.College;
import com.deevyanshu.entity.CollegeDetails;
import com.deevyanshu.entity.Student;
import com.deevyanshu.service.CollegeService;

@RestController
@RequestMapping("api/v1/college")
public class CollegeController {
	
	@Autowired
	private CollegeService service;
	
	@GetMapping("/all")
	public List<CollegeDetails> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/name/{id}")
	public String getCollegeName(@PathVariable("id")int id)
	{
		return service.getCollegeName(id);
	}
	
	@PostMapping("/add")
	public CollegeDetails add(@RequestBody College cl)
	{
		return service.add(cl);
	}
	
	@GetMapping("/{id}")
	public CollegeDetails getCollege(@PathVariable("id")int id)
	{
		return service.getCollege(id);
	}
	
	@PostMapping("/student/{cid}")
	public Student addStudent(@RequestBody Student stud,@PathVariable("cid") int cid)
	{
		return service.addStudent(stud, cid);
	}

}
