
public class Worker6 implements Runnable {

	@Override
	public void run() {
		for (int i = 500000; i < 1000000; i++) {
			SLvsRB.rbTest.put(i, i);
		}
		
	}

}