package classtest3;

public class ThrowsDemo1 {
	
	static void throwMethod() throws IllegalAccessException //declare throws is the method compulsorily 
    {  
        System.out.println("Inside throwMethod.");  
        throw new IllegalAccessException("demo");  
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
        {  
            throwMethod();  
        } 
        catch (IllegalAccessException e) 
        {  
            System.out.println("Caught " + e);  
        }  
    }  


	}


