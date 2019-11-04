package example;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

public class login_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Statement stmt=null;
		ResultSet rs=null;
		Connection conn=null;
		try {
			//1.ע�����ݿ��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.ͨ��DriverManager��ȡ���ݿ����ӡ�
			String url="jdbc:mysql://localhost:3306/student";
			String username1="root";
			String password1="990312";
			conn=DriverManager.getConnection(url,username1,password1);
			//3.ͨ��Connection������Statement����
			stmt=conn.createStatement();
			//4.ʹ��Statementִ��SQL��䡣
			String sql1="select * from login";
			rs=stmt.executeQuery(sql1);
			//5.����ResultSet�������
			while(rs.next()) {
				String name=rs.getString("user");
				String psw=rs.getString("password");
				if(username.equals("")) {
					response.getWriter().print("<h1>�û�������Ϊ�գ�</h1>");
					break;
				}
				if(password.equals("")) {
					response.getWriter().print("<h1>���벻��Ϊ�գ�</h1>");
					break;
				}
				if(username.equals(name)&&password.equals(psw)) {
					
					String remember = request.getParameter("remember");
					if(remember != null) {
						Cookie usercookie=new Cookie("username",username);
						Cookie passcookie=new Cookie("password",password);
						usercookie.setMaxAge(Integer.parseInt(remember));
						passcookie.setMaxAge(Integer.parseInt(remember));
					    response.addCookie(usercookie);
					    response.addCookie(passcookie);
					}
					HttpSession session=request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect(request.getContextPath()+"/my/welcome.jsp");
				}
				
			}
			
			PrintWriter out = response.getWriter();
			out.print("<h1>ERROR!</h1>");
//			//ע�ᣡ����
//			String sql2 = "insert into login(user,password) values(?,?)"; // ����һ��sql2���
//            // ����һ��Statement����
//            PreparedStatement ps = conn.prepareStatement(sql2);
//            // Ϊsql2����е�һ���ʺŸ�ֵ
//            ps.setString(1, users);
//            // Ϊsql2����еڶ����ʺŸ�ֵ
//            ps.setString(2, passw);
//            // ִ��sql2���
//            int result =ps.executeUpdate();// ����ֵ�����յ�Ӱ�������
//            if(result>0){
//				response.getWriter().print("ע��ɹ���");
//			}
//            ps.close();
//            //end������
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.�������ݿ���Դ��
			if(rs!=null) {
				try {
					rs.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

	}


}
