package Session6;

public class ThreadB implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name[] = new String[5];
		name[0] = "Lewy";
		name[1] = "Dewy";
		name[2] = "Hewy";
		name[3] = "Mickey";
		name[4] = "Donald";

		for (String names : name) {
			System.out.println("Names :" + names);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	final int setPriority(int MIN_PRIORITY) {
		return MIN_PRIORITY;
	}

}
