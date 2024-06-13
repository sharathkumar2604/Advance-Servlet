package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.dto.ShowroomsDto;
import com.sharath.service.ShowroomsService;
import com.sharath.service.ShowroomsServiceImpl;


//@WebServlet("/update")
public class UpdateDealsWIth extends HttpServlet {
	
	private static ShowroomsService service = new ShowroomsServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hgjhgj");
		PrintWriter write = response.getWriter();
		boolean b = service.updateDealsWithByNameAndLocation(request.getParameter("dealsWith"),request.getParameter("showroomName"),request.getParameter("location"));

		if (b) {
			write.print("<b>update successfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");

		} else {
			write.print("<b>update unsuccessfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");
		}

	}

	}


