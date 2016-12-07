package to_12704;

public class User extends IdInit {
	private int user_id;
private String name;
private String password;
private String sex;
private int age;
private String phone_number;
private String update_date;
private String last_update_date;
private String comments;
public int getUser_id()
{
	return user_id;
}
public void setUser_id(int user_id)
{
	this.user_id=user_id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getSex()
	{
		return sex;
	}
		
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getPhone_number()
	{
		return phone_number;
	}
	public void setPhone_number(String Phone_number)
	{
		this.phone_number=phone_number;
	}
	public String getUpdate_date()
	{
		return update_date;
	}
	public void setUpdate_date(String update_date)
	{
		this.update_date=update_date;
	}
	public String getLast_update_date()
	{
		return last_update_date;
	}
	public void setLast_update_date(String last_update_date)
	{
		this.last_update_date=last_update_date;
	}
	public String getComments()
	{
		return comments;
	}
	public void setComments(String comments)
	{
		this.comments=comments;
	}
	
}
