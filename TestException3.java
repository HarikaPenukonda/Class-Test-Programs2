package classtest3;

public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			bar();
			}catch(NullPointerException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();	}
			foo();
		}
		public static void bar(){
		}
			public static void foo() throws NullPointerException{	
			}



	}


