
public class Worker8 implements Runnable {

	@Override
	public void run() {
		for (int i = 50; i < 100; i++) {
			SLvsRB.rbTest2.put(i, i);
		}
		
	}

}