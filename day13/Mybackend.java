

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Mybackend")
public class Mybackend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		System.out.println("hello you have called a server");
	String name =request.getParameter("username");
	int age =Integer.parseInt(request.getParameter("age"));
	
	
	response.getWriter().print("your name is"+name+"<br>");
	response.getWriter().print("your age is"+age+"<br>");
	if(age>18)
	{
		response.getWriter().print("you can vote!!!!!");
	}
	else
	{
		response.getWriter().print("you cannot vote");
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
