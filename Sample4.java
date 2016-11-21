package classtest3;

public class Sample4 {
		
		public static void main(String[] args) throws Exception{
			Thread t1 = new Thread(getRunnable(3));
			Thread t2 = new Thread(getRunnable(4));
			t1.join();
			System.out.println("End");
		}

		public static Runnable getRunnable(final int id){
			return new Runnable(){
				public void run(){
					for(int i = 0; i < id; i++){
						System.out.print(" "+i);
					}
				}
			};
		}


}
