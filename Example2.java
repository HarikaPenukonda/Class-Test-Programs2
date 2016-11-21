package classtest3;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m = 2;
		int p = 1;
		int t =0;
		for(;p<5;p++)
		{
			if(t++>m)
			{
				m = p+t;
			}
		}
		
		System.out.println("t equals " + t);

	}

}

//t equals 4
