package edu.century.pa3;

public class TruckOfProduce {
	private Produce[] truck;
	
	public TruckOfProduce(int truckSize) {
		truck = new Produce[truckSize];
	}
	
	public void addProduce(Produce ref) {
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] == null) {
				truck[i] = ref;
				return;
			}
		}

		Produce[] newTruck = new Produce[truck.length * 2];
		for (int i = 0; i < truck.length; i++) {
			newTruck[i] = truck[i];
		}
		newTruck[truck.length] = ref;
		truck = newTruck;
	}
	
	public boolean search(String n) {
		boolean flag = false;
		for (int i = 0; i < truck.length; i++) {
			if(truck[i] != null && truck[i].getName().equals(n)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean remove(Produce ref) {
		if (search(ref.getName())) {
			Produce.delete(ref);
			return true;
		} else {
			return false;
		}
	}
	
	public double computeTotal(TruckOfProduce t) {
		double total = 0.0;
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] == null) {
				return total;
			}
			total += truck[i].getPrice() * truck[i].getQuantity();
		}
		return total;
	}
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] != null ) {
				str += truck[i].getName();
			}
		}
		return str;
	}
	
	public void ensureCapacity() {
		Produce[] newTruck = new Produce[truck.length * 2];
		for (int i = 1; i <= truck.length; i++) {
			if (truck[i] == null) {
				return;
			} else {
				for (int j = 1; j <= truck.length; j++) {
					newTruck[j] = truck[j];
				}
				truck = newTruck;
			}
		}
	}
}
