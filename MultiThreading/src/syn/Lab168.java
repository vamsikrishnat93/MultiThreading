package syn;

public class Lab168 {
	public static void main(String[] args) throws Exception {
		Account acc = new Account();
		new AccountThread(acc);
	}
}

// aswani

class Account {
	int bal = 1000;

	// it is not used synchronized keyword the transaction will be A and B
	// randomly transactions.
	// public void withDraw(int amt){
	// it is used synchronized keyword the transaction A will completed again
	// Transaction B completed.
	synchronized public void withDraw(int amt) {
		if (bal >= amt) {
			System.out.println(Thread.currentThread().getName() + "is going to withdrawn" + bal);
			try {
				Thread.sleep(1200);
			} catch (Exception e) {
			}
			bal = bal - amt;
			System.out.println(Thread.currentThread().getName() + "is Completed withdrawn" + bal);
		} else {
			System.out.println("No funds Transfer" + Thread.currentThread().getName());
		}
	}

	public int getBal() {
		return bal;
	}
}

class AccountThread implements Runnable {
	Account acc = null;

	AccountThread(Account acc) throws InterruptedException {
		this.acc = acc;
		Thread t1 = new Thread(this, "A");
		Thread t2 = new Thread(this, "B");
		t1.start();
		t1.join(400);
		t2.start();
		t2.join(1000);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			acc.withDraw(200);
			if (acc.getBal() < 0) {
				System.out.println("Amount is OverDrawn......");
			}
		}
	}
}
