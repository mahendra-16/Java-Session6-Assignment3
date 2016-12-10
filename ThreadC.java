package Session6;

public class ThreadC implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		double money = 105.22;
		System.out.println(money);
	}

	final int setPriority(int NORM_PRIORITY) {
		return NORM_PRIORITY;
	}

}
