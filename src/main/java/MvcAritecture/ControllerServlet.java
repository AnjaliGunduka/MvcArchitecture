package MvcAritecture;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String uname = request.getParameter("uname");
		String upassword = request.getParameter("upassword");
		LoginMvcBean bean = new LoginMvcBean();
		bean.setName(uname);
		bean.setPassword(upassword);
		request.setAttribute("bean", bean);
		boolean status = bean.validate();
		if (status) {
			RequestDispatcher dis = request.getRequestDispatcher("LoginSuccess.jsp");
			dis.forward(request, response);

		} else {
			RequestDispatcher dis = request.getRequestDispatcher("loginerror.jsp");
			dis.forward(request, response);
		}
	}

}
