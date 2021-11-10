package com.blotout.io.sampleProject.Objects;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Student> list=new ArrayList<Student>(); 
	
	public void addStudent(Student s)
	{
		list.add(s);
	}
	public List<Student> getStudents()
	{
		return list;
	}
	public Student getStudent(int id)
	{
		int i;
		for(i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==id)
				return list.get(i);
		}
		return new Student();
	}
	public void deleteStudent(int id)
	{
		int i;
		for(i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==id)
			{
				list.remove(i);
				break;
			}
		}
	}
	public void updateStudent(Student s)
	{
		int i;
		for(i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==s.getId())
			{
				list.set(i, s);
				break;
			}
		}
	}
}
