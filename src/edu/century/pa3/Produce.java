package edu.century.pa3;

public class Produce {

	private String name;
	private double price;
	private int quantity;
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setQuantity(int q) {
		quantity = q;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public static void delete(Produce ref) {
		ref = null;
	}
	
	public Produce(String n, double p, int q) {
		name = n;
		price = p;
		quantity = q;
	}
	
	public String toString() {
		String str = "Produce name is: " + getName() + "\nPrice is: " + getPrice() + "\nQuantity is: " + getQuantity();
		return str;
	}
	
}


