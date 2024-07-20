package Dropdown;

class Mythread extends Thread {

	public void run() {
		System.out.println("Working");
	}

	class runnable implements Runnable {

		@Override
		public void run() {
			System.out.println("Run it ");

		}

	}

	public static class Threadcreationexample {
		public static void main(String[] args) {

			Mythread c = new Mythread();
			c.start();

		}
	}
}