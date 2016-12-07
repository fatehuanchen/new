package to_12704;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Usedaoins implements Userdao{

	@Override
	public void save(Connection conn, User user) throws Exception {
		PreparedStatement ps=(PreparedStatement) conn.prepareCall("insert into cux_user"
				+ "values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, user.getUser_id());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getSex());
		ps.setInt(5, user.getAge());
		ps.setString(6, user.getPhone_number());
		ps.setString(7, user.getUpdate_date());
		ps.setString(8, user.getLast_update_date());
		ps.setString(9, user.getComments());
		ps.execute();
	}

	@Override
	public void update(Connection conn, Long id, User user) throws SQLException {
		
		
	}

	@Override
	public void delete(Connection conn, User user) throws SQLException {
		
		PreparedStatement ps=(PreparedStatement) conn.prepareCall(
				"delete from cux_users where id=?"
				);
		ps.setLong(1,user.getId());
		ps.execute();
		
	}
	public  ResultSet get(Connection conn,User user)throws SQLException
	{
		PreparedStatement ps=(PreparedStatement)conn.prepareStatement
				("select * from cux_users where user_name=? and password=?");
		ps.setString(1,user.getName());
		ps.setString(2,user.getPassword());
		return ps.executeQuery();
		
	}

	
}
