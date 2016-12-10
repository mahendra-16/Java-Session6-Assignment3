package Session6;

public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA tda = new ThreadA();
		System.out.println("Thread Priority : " +tda.setPriority(25));
		tda.run();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		Thread tdb = new Thread(new ThreadB());
		tdb.run();
		tdb.setPriority(10);
		System.out.println("Thread Priority : " + tdb.getPriority());
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		
		ThreadC tdc = new ThreadC();
		System.out.println("Thread Priority : " +tdc.setPriority(15));
		tdc.run();
		
	
	}

}
