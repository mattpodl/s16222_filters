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

@WebFilter("/add")
public class RegistrationFilter implements Filter{

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		HttpSession session = httpRequest.getSession();



		if(fieldsAreCorrectlyFilled(httpRequest)) {
			chain.doFilter(request, response);
		} else {
			httpResponse.sendRedirect("index.jsp");
		}


	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

	private boolean fieldsAreCorrectlyFilled(HttpServletRequest request) {
		String[] attributes = {
				request.getParameter("username").trim(),
				request.getParameter("mail").trim(),
				request.getParameter("password").trim(),
				request.getParameter("password_confirmation").trim()
		};
		if(!request.getParameter("password").equals(request.getParameter("password_confirmation"))) {
			return false;
		}
		for(String attribute : attributes) {
			if(attribute.isEmpty()) {
				return false;
			}
		}
		return true;
	}

}
