package diaocha;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class second extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public second() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] box2 = request.getParameterValues("box");
//		ArrayList box1 = (ArrayList)request.getAttribute("box1");
//		if (box1.size()!=0) {
//			for (int i = box2.length; i < (box2.length+box1.size()); i++) {
//				box2[i]=(String) box1.get(i-box2.length);
//			}
//		}
		request.getSession().setAttribute("box2",box2);
		//request.setAttribute("box2",box2);
		RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
		rd.forward(request,response);
	
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
