
public class Worker5 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			SLvsRB.rbTest.put(i, i);
		}

		
	}

}
