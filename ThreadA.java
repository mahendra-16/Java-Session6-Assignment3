package Session6;

public class ThreadA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			System.out.println("Count : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	final int setPriority(int MAX_PRIORITY) {
		return MAX_PRIORITY;
	}

}
