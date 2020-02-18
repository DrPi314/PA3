package edu.century.pa3;

public class Vegetable extends Produce {

	public Vegetable(String n, double p, int q) {
		super(n, p, q);
		this.setName(n);
		this.setPrice(p);
		this.setQuantity(q);
	}
	
	@Override
	public String toString() {
		String str = "Vegetable name is: " + getName() + "\nPrice is: " + getPrice() + "\nQuantity is: " + getQuantity();
		return str;
	}

}
