package day09_1;

public abstract class GameUnit {
	int x ,y; // ������ ��ġ (��ǥ)
	abstract void move(int x, int y);
	void stop() {/* ������ġ�� ���� */}
	/*
	 * �߻�Ŭ������ �߻�޼ҵ嵵 ���� �� �ִ�.
	 *  ==> �߻�޼ҵ常 ������ ���� �ƴ� �Ϲݸ޼ҵ嵵 �󸶵��� ������ �����ϴ�.
	 */
}

class Marine extends GameUnit{
	@Override
	void move(int x, int y) {
		System.out.println("Marine�̵�");
	}
	void stimPack() {/* ������ ��� ���*/}
}

class Tank extends GameUnit{
	@Override
	void move(int x, int y) {}
	void changeMode() {/*������ ��� ���*/}
}

class DropShip extends GameUnit {
	@Override
	void move(int x, int y) {}
	
	void laod() {/*������ ����� ž�½�Ŵ*/}
	void unload() {/*������ ����� ������Ŵ*/}
}






