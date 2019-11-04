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
			//1.注册数据库的驱动。
			Class.forName("com.mysql.jdbc.Driver");
			//2.通过DriverManager获取数据库连接。
			String url="jdbc:mysql://localhost:3306/student";
			String username1="root";
			String password1="990312";
			conn=DriverManager.getConnection(url,username1,password1);
			//3.通过Connection对象获得Statement对象。
			stmt=conn.createStatement();
			//4.使用Statement执行SQL语句。
			String sql1="select * from login";
			rs=stmt.executeQuery(sql1);
			//5.操作ResultSet结果集。
			while(rs.next()) {
				String name=rs.getString("user");
				String psw=rs.getString("password");
				if(username.equals("")) {
					response.getWriter().print("<h1>用户名不能为空！</h1>");
					break;
				}
				if(password.equals("")) {
					response.getWriter().print("<h1>密码不能为空！</h1>");
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
//			//注册！！！
//			String sql2 = "insert into login(user,password) values(?,?)"; // 生成一条sql2语句
//            // 创建一个Statement对象
//            PreparedStatement ps = conn.prepareStatement(sql2);
//            // 为sql2语句中第一个问号赋值
//            ps.setString(1, users);
//            // 为sql2语句中第二个问号赋值
//            ps.setString(2, passw);
//            // 执行sql2语句
//            int result =ps.executeUpdate();// 返回值代表收到影响的行数
//            if(result>0){
//				response.getWriter().print("注册成功！");
//			}
//            ps.close();
//            //end！！！
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//6.回收数据库资源。
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
