package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAOImptn;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();
	StudentDAOImptn daoImptn=new StudentDAOImptn();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");
        if ( action != null) 
        {
        	List<Student> studentList = new ArrayList<Student>();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            response.setContentType("application/json");

        	if (action.equals("list")) {
        		try{
        		        // Fetch Data from Student Table
        		        studentList = daoImptn.getALLStudents();

        		        // Return in the format required by jTable plugin
        		        JSONROOT.put("Result", "OK");
        		        JSONROOT.put("Records", studentList);

        		        // Convert Java Object to Json
        		        String jsonArray = gson.toJson(JSONROOT);

        		        response.getWriter().print(jsonArray);
        		} catch (Exception ex) {
        		        JSONROOT.put("Result", "ERROR");
        		        JSONROOT.put("Message", ex.getMessage());
        		        String error = gson.toJson(JSONROOT);
        		        response.getWriter().print(error);
        		}
        	}
        	if (action.equals("create") || action.equals("update")) {
        		try{
        		        Student student = new Student();
        		        if (request.getParameter("studentId") != null) {
        		                int studentId = Integer.parseInt(request.getParameter("studentId"));
        		                student.setStudentId(studentId);
        		        }

        		        if (request.getParameter("name") != null) {
        		                String name = request.getParameter("name");
        		                student.setName(name);
        		        }

        		        if (request.getParameter("department") != null) {
        		                String department = request.getParameter("department");
        		                student.setDepartment(department);
        		        }

        		        if (request.getParameter("emailId") != null) {
        		                String emailId = request.getParameter("emailId");
        		                student.setEmailId(emailId);
        		        }

        		        if (action.equals("create")) {
        		                // Create new record
        		                daoImptn.savestudent(student);
        		        } else if (action.equals("update")) {
        		                // Update existing record
        		                daoImptn.updateStudent(student);
        		        }

        		        // Return in the format required by jTable plugin
        		        JSONROOT.put("Result", "OK");
        		        JSONROOT.put("Record", student);

        		        // Convert Java Object to Json
        		        String jsonArray = gson.toJson(JSONROOT);
        		        response.getWriter().print(jsonArray);
        		} catch (Exception ex) {
        		        JSONROOT.put("Result", "ERROR");
        		        JSONROOT.put("Message", ex.getMessage());
        		        String error = gson.toJson(JSONROOT);
        		        response.getWriter().print(error);
        		}
        	}
    		if (action.equals("delete")) {
    			try{
    			        // Delete record
    			        if (request.getParameter("studentId") != null) {
    			                int studentId = Integer.parseInt(request.getParameter("studentId"));
    			                daoImptn.deleteStudent(studentId);

    			                // Return in the format required by jTable plugin
    			                JSONROOT.put("Result", "OK");

    			                // Convert Java Object to Json
    			                String jsonArray = gson.toJson(JSONROOT);
    			                response.getWriter().print(jsonArray);
    			        }
    			} catch (Exception ex) {
    			        JSONROOT.put("Result", "ERROR");
    			        JSONROOT.put("Message", ex.getMessage());
    			        String error = gson.toJson(JSONROOT);
    			        response.getWriter().print(error);
    			}
    		}


        }
}
}

