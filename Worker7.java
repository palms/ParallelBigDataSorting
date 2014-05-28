
public class Worker7 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			SLvsRB.rbTest2.put(i, i);
		}
		
	}

}