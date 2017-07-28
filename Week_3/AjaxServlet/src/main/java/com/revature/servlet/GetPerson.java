package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Person;

/**
 * Servlet implementation class GetPerson
 */
public class GetPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetPerson() {
    	
    	super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	Person blake = new Person("Blake", "the beggining of time", "java trainer");
    	ObjectMapper om = new ObjectMapper();
    	String blakeString = null;
    	try {
			blakeString = om.writeValueAsString(blake);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(blakeString);
    	response.getWriter().write(blakeString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ObjectMapper om = new ObjectMapper();
		System.out.println(request.getParameter("person"));
		Person person = om.readValue(request.getParameter("person"), Person.class);
		System.out.println(person);
		
	}

}
