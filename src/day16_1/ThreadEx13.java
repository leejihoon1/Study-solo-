package day16_1;

public class ThreadEx13 {
	public static void main(String[] args) {
		RunImpEx13 r1 = new RunImpEx13();
		RunImpEx13 r2 = new RunImpEx13();
		RunImpEx13 r3 = new RunImpEx13();
		
		Thread th1 = new Thread(r1, "*");
		Thread th2 = new Thread(r2, "**");
		Thread th3 = new Thread(r3, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			r1.suspend();		// th1.suspend()�� �ƴ϶� r1.suspend()���� ��������.
			Thread.sleep(2000);
			r2.suspend();
			Thread.sleep(3000);
			r1.resume();
			Thread.sleep(3000);
			r1.stop();
			r2.stop();
			Thread.sleep(2000);
			r3.stop();
		} catch (Exception e) {}
	}
}

class RunImpEx13 implements Runnable{
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	// volatile : suspend(), resume(), stop()�� ������ �� �� �ʿ��� ������.
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (Exception e) { }
			}
		}
		System.out.println(Thread.currentThread().getName() + " - stopped");
	}
	
	public void suspend() {suspended = true;}
	public void resume() {suspended = false;}
	public void stop () {stopped = true;}
}