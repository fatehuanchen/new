package to_12704;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class Check {

	private Userdao userdao =new Usedaoins();
	public boolean check(User user)
	{
		Connection conn=null;
		try{
			
			conn=ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet=userdao.get(conn, user);
			//System.out.println(user.getName());
			
			while(resultSet.next())
			{
				return true;
			}
		}catch(Exception e)
		{
			try{
				conn.rollback();
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
		}finally
		{ try{
			conn.close();
		}
		catch(Exception e3)
		{
			e3.printStackTrace();
		}
		}
		return false;
	}
}
