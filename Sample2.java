/*package classtest3;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Sample2().doSomething();

	}

	public void doSomething() {
		int i = 5;
		Thread t = new Thread(new Runnable()) {
			public void run() {
				for (int j = 0; j <= 1; j++) {
					System.out.println(" " + j);
				}
			}
		};
		t.start();

	}

}
//compilation error
*/