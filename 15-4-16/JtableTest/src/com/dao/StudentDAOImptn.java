package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DbConnection;
import com.model.Student;

public class StudentDAOImptn implements studentDAO {

	DbConnection obj= DbConnection.getInstance();
	private PreparedStatement pStmt;
	
	public List<Student> getALLStudents() {
		
		 List<Student> students = new ArrayList<Student>();

	        String query = "SELECT * FROM STUDENT ORDER BY STUDENTID";
	        try {
	                Statement stmt = obj.getconnection().createStatement();
	                ResultSet rs = stmt.executeQuery(query);
	                while (rs.next()) {
	                        Student student = new Student();

	                        student.setStudentId(rs.getInt("STUDENTID"));
	                        student.setName(rs.getString("NAME"));
	                        student.setDepartment(rs.getString("DEPARTMENT"));
	                        student.setEmailId(rs.getString("EMAIL"));
	                        students.add(student);
	                }
	        } catch (SQLException e) {
	                System.err.println(e.getMessage());
	        }
	        return students;
	}

		
	

	
	public void savestudent(Student student) {
	String query ="insert into student(STUDENTID, NAME,DEPARTMENT, EMAIL) VALUES (?,?,?,?)";
	 try {
         pStmt = obj.getconnection().prepareStatement(query);
         pStmt.setInt(1, student.getStudentId());
         pStmt.setString(2, student.getName());
         pStmt.setString(3, student.getDepartment());
         pStmt.setString(4, student.getEmailId());
         pStmt.executeUpdate();
 } catch (SQLException e) {
         System.err.println(e.getMessage());
 }

	}

	
	public void deleteStudent(int id) {
		
		String deleteQuery = "DELETE FROM STUDENT WHERE STUDENTID = ?";
        try {
                pStmt = obj.getconnection().prepareStatement(deleteQuery);
                pStmt.setInt(1, id);
                pStmt.executeUpdate();
        } catch (SQLException e) {
                System.err.println(e.getMessage());
        }

	}

	
	public void updateStudent(Student student) {
		
		  String updateQuery = "UPDATE STUDENT SET NAME = ?, " +
                  "DEPARTMENT = ?, EMAIL = ? WHERE STUDENTID = ?";
  try {
          pStmt = obj.getconnection().prepareStatement(updateQuery);             
          pStmt.setString(1, student.getName());
          pStmt.setString(2, student.getDepartment());
          pStmt.setString(3, student.getEmailId());
          pStmt.setInt(4, student.getStudentId());
          pStmt.executeUpdate();

  } catch (SQLException e) {
          System.err.println(e.getMessage());
  }


	}

}
