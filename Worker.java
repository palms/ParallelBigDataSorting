


public class Worker implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 500000; i++) {
			SLvsRB.slTest.insert(i);
		}
		
	}

}


