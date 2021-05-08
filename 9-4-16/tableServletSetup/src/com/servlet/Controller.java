package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.model.Student;

public class Controller extends HttpServlet {
        private static final long serialVersionUID = 1L;
        private HashMap<String, Object> JSONROOT = new HashMap<String, Object>();

        public void doPost(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {
        
        String action = request.getParameter("action");
        if ( action != null) 
        {
                List<Student> studentList = new ArrayList<Student>();

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                response.setContentType("application/json");

                if (action.equals("list")) 
                {
                        try
                        {                                                                       
                        // Add data to Student list
                        studentList.add(new Student(1, "Haripriya", "IT", "xyz@xyz.com"));
                        studentList.add(new Student(2, "Dinesh", "ECE", "xyz@gmail.com"));
                        studentList.add(new Student(3, "Prabhu", "MECH", "abc@gmail.com"));
                        studentList.add(new Student(4, "Badru", "ECE", "efg@gmail.com"));
                        studentList.add(new Student(5, "Lahir nisha", "CSC", "xyz@gmail.com"));
                        studentList.add(new Student(6, "Nilafar nisha", "CSC", "123@gmail.com"));
                        studentList.add(new Student(7, "Jamil", "ECE", "789@gmail.com"));
                        studentList.add(new Student(8, "Mahes", "ECE", "123@gmail.com"));
                        studentList.add(new Student(9, "Lourde", "IT", "xyz@gmail.com"));

                        //Return in the format required by jTable plugin
                        JSONROOT.put("Result", "OK");
                        JSONROOT.put("Records", studentList);
                        
                        // Convert Java Object to Json
                        String jsonArray = gson.toJson(JSONROOT);
                        System.out.println(jsonArray);

                        response.getWriter().print(jsonArray);
                        }
                        catch(Exception ex){
                                JSONROOT.put("Result", "ERROR");
                                JSONROOT.put("Message", ex.getMessage());
                                String error = gson.toJson(JSONROOT);
                                response.getWriter().print(error);
                        }                               
                }
                }
         }
}
