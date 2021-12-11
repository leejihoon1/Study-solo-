package day4;

public class ArrayEx06 {
	public static void main(String[] args) {
		// �ּҰ��� �ִ밪 ã��
		
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		int max = 0;
		int min = 0;
		
		max = score[0];	// �ִ밪�̶�� ����
		min = score[0]; // �ּҰ��̶�� ����
		
		for(int i = 1; i < score.length; i ++) {
			if(score[i] > max) {
				max = score[i];
			}else if (score[i] < min) {
				min = score[i];
			}
		}
		
		/*
		 * i ==1
		 * max == 79
		 * score[1] == 88
		 * score[1] > max ==> 88 > 79 ==> amx == 88, mi n 79
		 * 
		 * i == 2
		 * max == 88
		 * score[2] == 91
		 * score[2] > max ==> 91 > 88 ==> max == 9, min ==79
		 * 
		 * i = 3
		 * max == 91
		 * score[3] ==33
		 * score[3] > max ==> 33 > 91 false
		 * score[3] < min ==> 33 < 79 => min ==33, max ==91
		 */
		
		System.out.println("�ִ밪 : " + max);	// 100
		System.out.println("�ּҰ� : " + min);	// 33 
	}
}
