package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegisterPage() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String password=request.getParameter("password");
		HttpSession session=request.getSession();
		
		session.setAttribute("fname", firstname);	
		session.setAttribute("lname", lastname);
		session.setAttribute("name",username);
		session.setAttribute(password,password);
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request, response);
		out.println("<center><h3>Registration successful</h3></center>");
	}

}
