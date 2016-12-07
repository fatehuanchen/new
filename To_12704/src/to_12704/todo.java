package to_12704;

public class todo extends IdInit {
	private int todo_id;
	private int user_id;
	private String todo_title;
	private String todo_content;
	private String priority;
	private String update_date;
	private String last_update_date;
	private String comments;
	
	public int getTodo_id()
	{
		return todo_id;
	}
public void setTodo_id(int todo_id)
{
	this.todo_id=todo_id;
	
}
public int getUser_id()
{
	return user_id;
}
public void setUser_id(int user_id)
{
	this.user_id=user_id;
}
public String getPriority()
{
	return priority;
}
public void setPriority(String priority)
{
	this.priority=priority;
}
	public String getTodo_title()
	{
		return todo_title;
	}
	public void setTodo_title(String todo_title)
	{
		this.todo_title=todo_title;
	}
	public String getTodo_content()
	{
		return todo_content;
	}
		
	public void setTodo_content(String todo_content)
	{
		this.todo_content=todo_content;
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
