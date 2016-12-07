package to_12704;

import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
private static String driver;
private static String dburl;
private static String user;
private static  String password;
Connection conn=null;
private static final ConnectionFactory factory=new ConnectionFactory();
static 
{
	Properties prop =new Properties();
	try
	{
		InputStream in=ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
		prop.load(in);
	} catch(Exception e)
	{
		System.out.println("===�����ļ���ȡ����===");
	}
	driver=prop.getProperty("driver");
	dburl=prop.getProperty("dburl");
	user=prop.getProperty("user");
	password=prop.getProperty("password");
}
private ConnectionFactory()
{
	
}
public static ConnectionFactory getInstance()
{
	return factory;
}
public Connection makeConnection()
{
	try{
	Class.forName(driver);
	 conn=(Connection)DriverManager.getConnection(dburl, user, password);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
    return conn;
}
}
