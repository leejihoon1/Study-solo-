package day09_1;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TvProduct()); // Product p = new TvProduct();
		System.out.println("���� ���� �� : " +b.money);
		System.out.println("���� ���ʽ� ���� : " + b.bonusPoint);
		
		b.buy(new ComputerProduct()); // Product p = new ComputerProduct();
		System.out.println("���� ���� �� : " +b.money);
		System.out.println("���� ���ʽ� ���� : " + b.bonusPoint);
		
		b.summery();
	}
}

class Product{
	int price;
	int bonusPoint;
	
	public Product (int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class TvProduct extends Product{
	public TvProduct() {
		super(100);
	}	
	
	@Override
	public String toString() {
		return "TvProduct";
	}
}

class ComputerProduct extends Product{
	public ComputerProduct() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "ComputerProduct";
	}
}

class Buyer{			// ��, ������ ��� ���
	int money = 1000; 	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ��ݾ�
	Product[] item = new Product[10];
	int i = 0; 
	
	
	// item[0] = new TvProduct();			����
	// item[1] = new ComputerProduct();		����
	// Product p1 = new TvProduct();		����
	
//	void buy(TvProduct tv) {
//		if(money < tv.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		
//		money -= tv.price;
//		bonusPoint += tv.bonusPoint;
//		System.out.println(tv + "�� �����Ͽ����ϴ�.");
//	}
//	
//	void buy(ComputerProduct pc) {
//		if(money < pc.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		
//		money -= pc.price;
//		bonusPoint += pc.bonusPoint;
//		System.out.println(pc + "�� �����Ͽ����ϴ�.");
//	}
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		// Product p = new Product();
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // item[0] = p;  ����������
		System.out.println(p + "�� �����Ͽ����ϴ�.");
	}
	
	void summery() {
		int sum =0;
		String itemlist = "";
		
		for(int i = 0; i < item.length; i ++) {
			if(item[i] ==null) {
				break;
			}
			sum += item[i].price;
			itemlist += item[i] + ", ";		
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ� :" + sum);
		System.out.println("�����Ͻ� ��ǰ ��� : " + itemlist);
	}
}

























