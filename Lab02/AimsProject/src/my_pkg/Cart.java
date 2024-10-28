package my_pkg;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc orderedItems[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDVD(DigitalVideoDisc disc) {
		if(this.qtyOrdered < 20) {
			orderedItems[qtyOrdered] = disc;
			System.out.println("The disc has been added!");
			qtyOrdered++;
			return;
		}
		System.out.println("The cart is full!");
		return;
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		int revoved = 0;
		for(int i=0; i<this.qtyOrdered;i++) {
			if(orderedItems[i] == disc)
		}
	}
	
	
}
