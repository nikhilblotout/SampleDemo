package com.blotout.io.sampleProject.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blotout.io.sampleProject.Objects.StudentService;

import com.blotout.io.sampleProject.Objects.*;
@RestController
public class Controller {
	
	@Autowired
	private StudentService studentService;
	//greeting request
	@RequestMapping("/hello")
	public String greeting()
	{
		return "Hello world ";
	}
	// get request for to retrieve all students
	@RequestMapping("/getAll")
	public List<Student> getAll()
	{
		return studentService.getStudents();
	}
	//get request to retrieve particular student details
	@RequestMapping("/get/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return studentService.getStudent(id);
	}
	//post request to add student into list
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public void addStudent(@RequestBody Student s)
	{
		studentService.addStudent(s);
	}
	//update request to update details of student
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public void updateStudent(@RequestBody Student s)
	{
		studentService.updateStudent(s);
	}
	//delete request for particular student based on id
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
}
