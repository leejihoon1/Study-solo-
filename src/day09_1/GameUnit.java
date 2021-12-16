package day09_1;

public abstract class GameUnit {
	int x ,y; // 유닛의 위치 (좌표)
	abstract void move(int x, int y);
	void stop() {/* 현재위치에 정지 */}
	/*
	 * 추상클래스는 추상메소드도 가질 수 있다.
	 *  ==> 추상메소드만 가지는 것이 아닌 일반메소드도 얼마든지 선언이 가능하다.
	 */
}

class Marine extends GameUnit{
	@Override
	void move(int x, int y) {
		System.out.println("Marine이동");
	}
	void stimPack() {/* 고유한 기술 사용*/}
}

class Tank extends GameUnit{
	@Override
	void move(int x, int y) {}
	void changeMode() {/*고유한 기술 사용*/}
}

class DropShip extends GameUnit {
	@Override
	void move(int x, int y) {}
	
	void laod() {/*선택한 대상을 탑승시킴*/}
	void unload() {/*선택한 대상을 하차시킴*/}
}






