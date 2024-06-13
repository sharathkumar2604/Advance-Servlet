package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.dto.ShowroomsDto;
import com.sharath.service.ShowroomsService;
import com.sharath.service.ShowroomsServiceImpl;

//before create servlet adding class name and package and then remove save and get retain post method asit is 
public class SaveServlet extends HttpServlet {

	// create below one
	private static ShowroomsService service = new ShowroomsServiceImpl();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		String name = request.getParameter("showroomName");
		String dealsWith = request.getParameter("dealsWith");
		String location = request.getParameter("location");

		ShowroomsDto dt = new ShowroomsDto(name, dealsWith, location);
		boolean b = service.save(dt);

		if (b) {
			write.print("<b>Saved successfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");

		} else {
			write.print("<b>Saved unsuccessfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");
		}

	}

}
