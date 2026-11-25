package Week5;

public class Proudct {
	private String name;
	private double price;
	private int quantity;
	
public Product (String name,double p,int q)
	{
		this.name=name;
		price=p;
		quantity=q;
	}
	public String getName() {
		return name;
	}
	public double getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public void displayInfo() {
		System.out.println("Name"+name);
		System.out.println("Quantity"+quantity);
		System.out.println("Price"+price);
	}
}
