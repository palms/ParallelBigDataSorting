
public class Worker3 implements Runnable {


	@Override
	public void run() {

		for (int i = 0; i < 50; i++) {
			SLvsRB.slTest2.insert(i);
		}
		
	}

}
