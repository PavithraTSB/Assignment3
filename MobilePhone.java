package assignments;

class telephone 
	{ 
	    void telephone() //Method
	    { 
	    	
	    	int telno= 12345;//Variable declaration
	        System.out.println("Telephone number -" +telno); 
	    } 
	
	  
	  telephone(String str) //Constructor
	    { 
	        // invoke or call parent class constructor 
	    	this.telephone(); //using this keyword
	        System.out.println("Telephone Constructor"); 
	    } 
	}
	
	class mobphone extends telephone
	{ 
	       mobphone(String str) //parameterized constructor
	       {
			super(str); //Using super keyword to call the parent class constructor
			System.out.println("Mobphone Constructor"); 
		}

	} 
	
	  
	
	class MobilePhone 
	{ 
	    public static void main(String[] args) 
	    { 
	        mobphone s = new mobphone(null); //creating object to call all the methods
	       
	    } 
	} 

