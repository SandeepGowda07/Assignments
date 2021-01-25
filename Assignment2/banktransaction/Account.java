package package1;

public class Account {
	private int balance=1000;
	
	public int getbalance() {
		return balance;
	}
	 public void withdraw(int bal) throws InterruptedException {
		if(balance>=bal) {
			System.out.println(Thread.currentThread().getName()+ " try to withdraw");
			balance = balance - bal;
			System.out.println(Thread.currentThread().getName() + " is completed withdraw");
			System.out.println(Thread.currentThread().getName() + " withdraw Rs " + bal);
			Thread.sleep(1000);
		}else {
			System.out.println(Thread.currentThread().getName() + " insufficient balance");
		}
	
	}
	 public void Deposit(int bal) throws InterruptedException {
		if(bal>0) {
			balance = balance + bal;
			System.out.println(Thread.currentThread().getName() + " is completed deposit");
			Thread.sleep(1000);
		}else {
			System.out.println(Thread.currentThread().getName() + "doesn't have amount to deposit");
		}
		System.out.println(Thread.currentThread().getName() + " balance Rs " + balance);
		Thread.sleep(1000);
	}
	 }

	