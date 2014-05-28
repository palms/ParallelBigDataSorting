

public class SLvsRB {

	static SkipList<Integer> slTest = new SkipList<Integer>(100);
	static SkipList<Integer> slTest2 = new SkipList<Integer>(100);
	static RedBlackBST<Integer,Integer> rbTest = new RedBlackBST<Integer,Integer>();
	static RedBlackBST<Integer,Integer> rbTest2 = new RedBlackBST<Integer,Integer>();
	
	
	public static void main(String[] args) {

		System.out.println("Running Skip List test..");

		Thread thread1 = new Thread() {
			public void run() {
				Worker w1 = new Worker();
				w1.run();
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				Worker2 w2 = new Worker2();
				w2.run();
			}
		};

		long preSL = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		long postSL = System.currentTimeMillis();

		System.out.println("Finished Skip List test, running Red-Black Tree test..");


		Thread thread5 = new Thread() {
			public void run() {
				Worker5 w1 = new Worker5();
				w1.run();
			}
		};
		Thread thread6 = new Thread() {
			public void run() {
				Worker6 w2 = new Worker6();
				w2.run();
			}
		};
		
		long preRB = System.currentTimeMillis();
		thread5.start();
		thread6.start();
		long postRB = System.currentTimeMillis();

		System.out.println("Inserting 1,000,000 unique values:");
		System.out.println("Concurrent SkipList time = " + (postSL - preSL)
				+ "ms");
		System.out.println("Red-Black tree time = " + (postRB - preRB) + "ms\n");
		
		
		
		
		////////////////////////////////////////
		

		Thread thread3 = new Thread() {
			public void run() {
				Worker3 w1 = new Worker3();
				w1.run();
			}
		};
		Thread thread4 = new Thread() {
			public void run() {
				Worker4 w2 = new Worker4();
				w2.run();
			}
		};
		
		System.out.println("Running Skip List test..");

		long preSL2 = System.currentTimeMillis();
		thread3.start();
		thread4.start();
		long postSL2 = System.currentTimeMillis();
		
		
		System.out.println("Finished Skip List test, running Red-Black Tree test..");
		
		Thread thread7 = new Thread() {
			public void run() {
				Worker7 w1 = new Worker7();
				w1.run();
			}
		};
		Thread thread8 = new Thread() {
			public void run() {
				Worker8 w2 = new Worker8();
				w2.run();
			}
		};
		
		long preRB2 = System.currentTimeMillis();
		
		thread7.start();
		thread8.start();
		
		long postRB2 = System.currentTimeMillis();
		
		System.out.println("Inserting 100 unique values:");
		System.out.println("Concurrent SkipList time = " + (postSL2 - preSL2) + "ms");
		System.out.println("Red-Black tree time = " + (postRB2 - preRB2) + "ms\n");

	}

}
