package edu.century.pa3;

public class Driver {
	
	public static void main(String[] args) {
		Fruit kiwi = new Fruit("Kiwi", 5.37, 23);
		Fruit lemon = new Fruit("Lemon", 4.89, 19);
		Vegetable cabbage = new Vegetable("Cabbage", 8.22, 37);
		Vegetable carrot = new Vegetable("Carrot", 7.72, 25);
		TruckOfProduce van = new TruckOfProduce(5);
		van.addProduce(kiwi);
		van.addProduce(lemon);
		van.addProduce(carrot);
		van.addProduce(cabbage);
		System.out.println(kiwi.toString());
		System.out.println(carrot.toString());
		System.out.println(van.toString());
		System.out.println(van.search("kiwi"));
		System.out.println(van.remove(carrot));
		System.out.println(van.toString());
		System.out.println(van.computeTotal(van));
		
		
	}
}
