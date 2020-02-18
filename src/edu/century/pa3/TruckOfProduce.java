package edu.century.pa3;

public class TruckOfProduce {
	private int truckID;
	private Produce[] truck = new Produce[3];
	
	public void setID(int id) {
		truckID = id;
	}
	
	public int getID() {
		return truckID;
	}
	
	public TruckOfProduce(int id) {
		truckID = id;
	}
	
	public void addProduce(Produce ref) {
		for (int i = 0; i < truck.length; i++)
			if(truck[i] == null)
				truck[i] = ref;
	}
	
	public boolean search(String n) {
		boolean flag = false;
		for (int i = 0; i < truck.length; i++) {
			if(truck[i].getName().equals(n))
				flag = true;	
		}
		return flag;
	}
	
	public boolean remove(Produce ref) {
		if (search(ref.getName())) {
			Produce.delete(ref);
			return true;
		}
		else
			return false;
	}
	
	public double computeTotal(TruckOfProduce t) {
		double total = 0.0;
		for(int i = 0; i < truck.length; i++) {
			total += truck[i].getPrice() * truck[i].getQuantity();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String str = null;
		for (int i = 0; i < truck.length; i++)
			str = str + truck[i].getName();
		return str;
	}
	
	public void ensureCapacity() {
		Produce[] newTruck = new Produce[truck.length * 2];
		for (int i = 1; i <= truck.length; i++) {
			if (truck[i] == null) {
				return;
			} else {
				for (int j = 1; j <= truck.length; j++)
					newTruck[j] = truck[j];
				truck = newTruck;
			}
		}
	}
}
