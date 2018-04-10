package servlets;

import domain.UserAccount;
import java.io.IOException;
import repositories.UserRepository;
import repositories.DummyUserRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddApplicantServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserRepository repository;

	public void init(ServletConfig config) throws ServletException{
		repository = new DummyUserRepository();
	}

	private UserAccount retrieveApplicationFromRequest(HttpServletRequest request){
		UserAccount application = new UserAccount();
		application.setUsername(request.getParameter("username"));
		application.setEmail(request.getParameter("mail"));
		application.setPassword(request.getParameter("password"));
		application.setPremium("false");
		return application;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		UserAccount application = retrieveApplicationFromRequest(request);

		repository.add(application);
		response.sendRedirect("success.jsp");

	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {


	}


}
