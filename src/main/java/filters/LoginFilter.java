package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.UserAccount;
import repositories.DummyUserRepository;
import repositories.UserRepository;

@WebFilter("/login")
public class LoginFilter implements Filter{

	private UserRepository repository;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		repository = new DummyUserRepository();
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		try {
			 UserAccount user = repository.getUserByUsername(httpRequest.getParameter("username"));
			 if (!user.getPassword().equals(httpRequest.getParameter("password"))) {
					httpResponse.sendRedirect("index.jsp");
				}
			}
		catch (NullPointerException e) {
				httpResponse.sendRedirect("error");
			}
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig config) throws ServletException {



	}

}
