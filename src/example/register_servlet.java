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
			//1.ע�����ݿ��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.ͨ��DriverManager��ȡ���ݿ����ӡ�
			String url="jdbc:mysql://localhost:3306/student";
			String username1="root";
			String password1="990312";
			conn=DriverManager.getConnection(url,username1,password1);
//			//3.ͨ��Connection������Statement����
			stmt=conn.createStatement();
			//4.ʹ��Statementִ��SQL��䡣
			String sql1="select * from login";
			rs=stmt.executeQuery(sql1);
			//5.����ResultSet�������
			while(rs.next()) {
				String name=rs.getString("user");
				if(users.equals(name)) {
					response.getWriter().println("ע��ʧ��,���û����Ѵ��ڡ�<br/>");
				}
			}
			
            if(users.equals("")||passw1.equals("")){
	        	response.getWriter().println("ע��ʧ��,�û��������벻��Ϊ�ա�");
	        }else if(passw1.equals(passw2)) {
	        	//ע�ᣡ����
				String sql2 = "insert into login(user,password) values(?,?)"; // ����һ��sql2���
	            // ����һ��Statement����
	            PreparedStatement ps = conn.prepareStatement(sql2);
	            // Ϊsql2����е�һ���ʺŸ�ֵ
	            ps.setString(1, users);
	            // Ϊsql2����еڶ����ʺŸ�ֵ
	            ps.setString(2, passw1);
	            // ִ��sql2���
            	int result =ps.executeUpdate();// ����ֵ�����յ�Ӱ�������
            	if(result>0){
    				response.sendRedirect(request.getContextPath()+"/success.jsp");
    			}
            	ps.close();
            	//end������
            }else {
            	response.getWriter().println("ע��ʧ�ܣ��������벻һ�¡�");
			}
		     
        	
            
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
