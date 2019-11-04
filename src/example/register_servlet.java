package example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register_servlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String users=request.getParameter("user");
		String passw1=request.getParameter("pass1");
		String passw2=request.getParameter("pass2");
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
//			//3.通过Connection对象获得Statement对象。
			stmt=conn.createStatement();
			//4.使用Statement执行SQL语句。
			String sql1="select * from login";
			rs=stmt.executeQuery(sql1);
			//5.操作ResultSet结果集。
			while(rs.next()) {
				String name=rs.getString("user");
				if(users.equals(name)) {
					response.getWriter().println("注册失败,该用户名已存在。<br/>");
				}
			}
			
            if(users.equals("")||passw1.equals("")){
	        	response.getWriter().println("注册失败,用户名或密码不能为空。");
	        }else if(passw1.equals(passw2)) {
	        	//注册！！！
				String sql2 = "insert into login(user,password) values(?,?)"; // 生成一条sql2语句
	            // 创建一个Statement对象
	            PreparedStatement ps = conn.prepareStatement(sql2);
	            // 为sql2语句中第一个问号赋值
	            ps.setString(1, users);
	            // 为sql2语句中第二个问号赋值
	            ps.setString(2, passw1);
	            // 执行sql2语句
            	int result =ps.executeUpdate();// 返回值代表收到影响的行数
            	if(result>0){
    				response.sendRedirect(request.getContextPath()+"/success.jsp");
    			}
            	ps.close();
            	//end！！！
            }else {
            	response.getWriter().println("注册失败，两次密码不一致。");
			}
		     
        	
            
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
