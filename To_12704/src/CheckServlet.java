

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import to_12704.Check;
import to_12704.User;


@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private Check cku=new Check();  
    
    public CheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("1");
		request.setCharacterEncoding("UTF-8");
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("upwd");
		RequestDispatcher rd=null;
		String forward=null;
		if(uname==null||passwd==null)
		{
			request.setAttribute("msg", "用户名或密码为空");
			rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
			
		}else
		{
			User user=new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool=cku.check(user);
			if(bool)
			{
				forward="/Success.jsp";
			}
			else 
			{
				forward="/error.jsp";
			}
			
			request.setAttribute("todo_user", user);
			rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
		
	}

}
