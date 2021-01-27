package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginPage() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username=request.getParameter("name");
		String password=request.getParameter("password");
		RequestDispatcher rd=null;
		HttpSession session=request.getSession(true);	
			
		String uname=(String)session.getAttribute("name");
		String pass=(String)session.getAttribute(password);
		String fname=(String)session.getAttribute("fname");
		String lname=(String)session.getAttribute("lname");
		
			if(session!=null&&username.equalsIgnoreCase(uname)&& password.equals(pass)){
						out.println("Hello "+fname+" "+lname);
			}else {
		   rd=request.getRequestDispatcher("link.html");
		    rd.include(request, response);
		    out.println("<center><h3>Please register first</h3></center>");
	}

	}
}