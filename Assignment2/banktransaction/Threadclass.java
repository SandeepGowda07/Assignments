package package1;


public class Threadclass extends Account implements Runnable {
			
			
		public static void main(String[] args) throws InterruptedException {
			Threadclass tc = new Threadclass();
			Thread t1 = new Thread(tc,"accounid:101 ");
			Thread t2 = new Thread(tc,"accountid:102 ");
			Thread t3 = new Thread(tc,"accountid:103 ");
			t1.start();
			t2.start();
			t3.start();
			
	}
	public  void run() {
		synchronized(this) {
		Account acc = new Account();
		try {
			acc.withdraw(500);
			Thread.sleep(1000);
;			acc.Deposit(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			}

	}

}
