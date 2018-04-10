package servlets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.UserAccount;
import repositories.DummyUserRepository;
import repositories.UserRepository;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserRepository repository;

	public void init(ServletConfig config) throws ServletException {
		repository = new DummyUserRepository();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession session = request.getSession();
		UserAccount user = repository.getUserByUsername(request.getParameter("username"));

		session.setAttribute("user", user);
		session.setAttribute("username", user.getUsername());
		response.getWriter().println("poprawnie zalogowano");
		try
		{
		    Thread.sleep(2000);
		}
		catch (Exception ex)
		{

		}
		finally
		{
			response.sendRedirect("/user_account");
		}

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	}

}
