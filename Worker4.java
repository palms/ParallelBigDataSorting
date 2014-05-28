
public class Worker4 implements Runnable {


	@Override
	public void run() {

		for (int i = 50; i < 100; i++) {
			SLvsRB.slTest2.insert(i);
		}
		
	}

}
