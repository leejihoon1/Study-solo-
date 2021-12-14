package day07_1;

public class DrawShape {
	public static void main(String[] args) {
		Point p1 = new Point(150,150);
		Circle c1 = new Circle(p1,50);
		
		// 		==	   Circle(Point center, int r)
		Circle c= new Circle(new Point(150,150), 50);
		c.draw();
		
		Point[]p = {
			new Point(100,100),
			new Point(140,50),
			new Point(200,100)
		};
		//Triangle(Point[]p)
		Triangle t = new Triangle(p);
		t.draw();
		//System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXy(), p[1].getXy(), p[2].getXy(), color);
		
	}
}

class Shape{
	String color = "black";
	void draw() {
		System.out.println("[color=" + color + "]");
	}
}

class Point{
	int x;
	int y;
	// Point p = new  Point();
	// p.x == 0
	// p.y == 0
	// Point p =new Point (150,150);
	// p.x = 150
	// p.y = 150
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getXy(){
		return "("+x+", "+y+")"; // Ex (1,2)
	}
}

class Circle extends Shape{
	Point center; // ÁÂÇ¥
	int r;		  // ¹ÝÁö¸§
	
	Circle(Point center, int r){ // Point center = new Point(150,150);
		this.center = center;
		this.r = r;
	}
	
	Circle(){
		this(new Point(0,0),100);
	}
	
	@Override
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	Point[] p = new Point[3];
	// int [] arr = new int[3]; arr[1] = 10, 20, 30, ....
	
	Triangle(Point[]p) {
		this.p = p;
	}
	
	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXy(), p[1].getXy(), p[2].getXy(), color);
	}
}





