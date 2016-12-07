package List01;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo01 {
  public static void main(String args[])
  {
	//  List<String> l=new ArrayList<String>();
	  ArrayList<String> lists=new ArrayList<String>();
	  
	  lists.add("A");
	  lists.add("C");
	  lists.add("B");
	  Iterator<String> iter=lists.iterator();
	  while(iter.hasNext())
		  
	  {
		  String str=iter.next();
		  if("A".equals(str))
		  {   
			  iter.remove();
		  }
		  else{
		  System.out.println(str);
		  }
	  }
	
	
		
  }
	
	 
}
