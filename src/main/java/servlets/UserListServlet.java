package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.UserAccount;
import repositories.DummyUserRepository;
import repositories.UserRepository;

@WebServlet("/users_list")
public class UserListServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserRepository repository;

	public void init(ServletConfig config) throws ServletException {
		repository = new DummyUserRepository();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		for(UserAccount user : repository.getAllUsers()){
			response.getWriter().println(user+"\n\n######\n\n");
		};
	}

}
