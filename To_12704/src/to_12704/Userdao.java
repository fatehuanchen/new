package to_12704;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public interface Userdao {
	public void save(Connection conn,User user)throws Exception;
	public void update(Connection conn,Long id,User user)throws SQLException;
	public void delete(Connection conn,User user)throws SQLException;
	public  ResultSet get(Connection conn,User user)throws SQLException;

}
