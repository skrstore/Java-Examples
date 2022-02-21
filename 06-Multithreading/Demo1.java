class NewDemo1Thread implements Runnable {
	// NewDemo1Thread(String name) throws InterruptedException {
	// // Thread t = new Thread(this, name);
	// // t.join(1000);
	// }

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
				Thread.sleep(501);
			}
		} catch (Exception e) {
		}
	}
}

class Demo1 {
	public static void main(String[] args) throws Exception {
		NewDemo1Thread nt1 = new NewDemo1Thread();
		Thread t = new Thread(nt1, name);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Parent");
		}
	}
}
