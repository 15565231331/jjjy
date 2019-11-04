package example;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session1=request.getSession();
		session1.invalidate();
		HttpSession session2=request.getSession();
		session2.setAttribute("message", "您已经安全退出，请您重新登陆！");
		session2.setMaxInactiveInterval(5);
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath+"/login.jsp");
		
	}

}
