package com.dao;

import java.util.List;

import com.model.Student;

public interface studentDAO {
  
	public List<Student> getALLStudents();
	
	public void savestudent(Student obj);
	
	public void deleteStudent(int id);
	
	public void updateStudent (Student obj);
	
}
