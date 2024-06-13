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

public class ReadByName extends HttpServlet {
	private static ShowroomsService service = new ShowroomsServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter write = response.getWriter();
		try {

			ShowroomsDto byName = service.readByName(request.getParameter("showroomName"));
			
			write.print("<b>" + byName + "</b><br>");

			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		} catch (Exception e) {
			e.printStackTrace();
			write.print("<font color= red> <b>your datebase is empty</b>");
			write.print("<b>Go To Main page<a href=main.jsp>click here</b>");
		}
	}

}
