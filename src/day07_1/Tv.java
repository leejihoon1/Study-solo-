package day07_1;

public class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDomwn(){
		--channel;
	}
}
