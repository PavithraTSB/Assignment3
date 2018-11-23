package assignments;

public class GetterSetter {

	//declaring the variables in private
	private String name ="Pavi";
	private long phno= 938783832;
	private static int rollno=12345;
	
	public void findByrollno() 
	{
		 this.rollno =rollno;
		
	
	}
  public static void main(String args[])
  {
	  GetterSetter gs=new GetterSetter();
	  
	  System.out.println(rollno);
  }
}
