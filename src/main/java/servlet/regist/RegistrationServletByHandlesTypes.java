package servlet.regist;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServletByHandlesTypes extends HttpServlet implements RegistrationServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		out.print("this is Registration Servlet annotated by HandlesTypes<br>");
	}

}
