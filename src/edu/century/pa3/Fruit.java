package edu.century.pa3;

public class Fruit extends Produce {

	public Fruit(String n, double p, int q) {
		super(n, p, q);
		this.setName(n);
		this.setPrice(p);
		this.setQuantity(q);
	}
	
	@Override
	public String toString() {
		String str = "Fruit name is: " + getName() + "\nPrice is: " + getPrice() + "\nQuantity is: " + getQuantity();
		return str;
	}
	
}
