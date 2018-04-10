
import domain.UserAccount;
import java.io.IOException;
import repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import servlets.AddApplicantServlet;
import servlets.LoginServlet;

@RunWith(MockitoJUnitRunner.class)
public class TestAddApplicantServlet extends Mockito{

	@Spy
	UserRepository repository = mock(UserRepository.class);

	@InjectMocks
	LoginServlet servlet = new LoginServlet();

	@Test
	public void servlet_should_write_info_about_applicant_into_session()
			throws IOException, ServletException {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		HttpSession session = mock(HttpSession.class);
		when(request.getSession()).thenReturn(session);
		servlet.doPost(request, response);
		verify(session).setAttribute(eq("user"), Mockito.any(UserAccount.class));

	}

}
