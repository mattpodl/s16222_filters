package servlets;

import java.io.IOException;

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

@WebServlet("/add_premium")
public class AddPremiumAccountServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private static UserRepository repository;

	public void init(ServletConfig config) throws ServletException {
		repository = new DummyUserRepository();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		HttpSession session = request.getSession();
		UserAccount user = repository.getUserByUsername(request.getParameter("username"));
		if (user == null) {
			response.sendRedirect("/admin_site.jsp");
		}

		if(user.equals(session.getAttribute("user"))) {
			user.setPremium(request.getParameter("premium"));
			session.setAttribute("user", user);
		} else {
			user.setPremium(request.getParameter("premium"));
		}

		response.sendRedirect("/admin_site.jsp");

	}
}
