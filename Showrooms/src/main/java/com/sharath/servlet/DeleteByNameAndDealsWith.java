package com.sharath.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.sharath.service.ShowroomsService;
import com.sharath.service.ShowroomsServiceImpl;


public class DeleteByNameAndDealsWith extends HttpServlet {
	
private static ShowroomsService service = new ShowroomsServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter write = response.getWriter();
		boolean b = service.deleteByNameAndDealsWith(request.getParameter("showroomName"),request.getParameter("dealsWith"));

		if (b) {
			write.print("<b>deleted successfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");

		} else {
			write.print("<b>deleted unsuccessfully</b><br><br>");
			write.print("<b>go to main page<a href = main.jsp>clickHere</br>");
		}

	}

	}

