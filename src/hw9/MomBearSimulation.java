package hw9;

public class MomBearSimulation {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread mother = new Thread(new Mother(account));
		Thread bear = new Thread(new Bear(account));

		mother.start();
		bear.start();
	}
}

// 帳戶類別
class BankAccount {
	private int balance = 0;

	// 存款（媽媽呼叫）
	public synchronized void deposit() throws InterruptedException {
		if (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			return;
		}

		balance += 2000;
		System.out.println("媽媽存了2000，帳戶共有：" + balance);

		notify(); // 通知熊大帳戶有錢了
	}

	// 提款（熊大呼叫）
	public synchronized void withdraw() throws InterruptedException {
		if (balance < 1000) {
			System.out.println("雄大看到帳戶沒錢，暫停提款");
			wait(); // 等待媽媽匯款通知
			System.out.println("雄大被老媽告知帳戶已經有錢!");
		}

		balance -= 1000;
		System.out.println("雄大領了1000，帳戶共有：" + balance);

		if (balance < 2000) {
			System.out.println("雄大看到餘額在2000以下，要求匯款");
			System.out.println("媽媽被熊大要求匯款!");
		}
	}
}

// 媽媽執行緒
class Mother implements Runnable {
	private BankAccount account;
	private int depositCount = 0;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		try {
			while (depositCount < 10) {
				synchronized (account) {
					account.deposit();
					depositCount++;
				}
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// 熊大執行緒
class Bear implements Runnable {
	private BankAccount account;
	private int withdrawCount = 0;

	public Bear(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		try {
			while (withdrawCount < 10) {
				synchronized (account) {
					account.withdraw();
					withdrawCount++;
				}
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
