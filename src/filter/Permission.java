package filter;

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

@WebFilter(urlPatterns= {"/my/*"})
public class Permission implements Filter {
	public void destroy() {
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpservletrequest=(HttpServletRequest)request;
		HttpServletResponse httpservletresponse=(HttpServletResponse)response;
		HttpSession session=httpservletrequest.getSession();
		Object o=session.getAttribute("username");
		String contextpath=httpservletrequest.getContextPath();
		if(o==null) {
			//δ��¼ ȥ��¼
			httpservletresponse.sendRedirect(contextpath+"/login.jsp");
		}else {
			//�ѵ�¼ ת����˽����
			chain.doFilter(request, response);
			
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
