package Week4;

public class Rectangle {
		private double height = 1;
		private double width = 1;

	public Rectangle()  {

	}
	public Rectangle(double w,double h) {
		this.height = h;
		this.width = w;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void printData() {
		System.out.println(height+""+width);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4,40);
		Rectangle r3 = new Rectangle(3.5,35.9);
		
		r1.getArea();
		r1.getPerimeter();
		
		r2.getArea();
		r2.getPerimeter();
		double a = r1.getArea();
		System.out.println(a+" "+r2.getArea()+" "+r3.getArea());
	
		System.out.println(r1.getPerimeter()+" "+r2.getPerimeter()+" "+r3.getPerimeter());
		
		r1.setHeight(4);
		System.out.println(r1.getArea()+" "+r1.getPerimeter());
		r1.printData();
		r2.printData();
		r3.printData();
	}
}
