package day07_1;

public class TVCR extends Tv{
	VCR vcr = new VCR();
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	public static void main(String[] args) {
		TVCR tvcr = new TVCR(); 
		tvcr.power();
		tvcr.channelDomwn();
		tvcr.channelUp();
		tvcr.play();
	}
}
class VCR{
	boolean power;
	int counter = 0;
	void power() {
		power = !power;
	}
	void play () {}
	void stop() {}
	void rew() {}
	void ff() {}
}
