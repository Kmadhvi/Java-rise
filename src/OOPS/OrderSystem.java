package OOPS;

public class OrderSystem {
	static int totalOrders;
	static double taxRate;
	static double plateformFee;
	
	static{
		  taxRate = 0.18;       // 18% tax
		  plateformFee = 20.0;   // Fixed platform fee ₹20
	      totalOrders = 0;
	}
	int OrderID;
	double[] itemPrice;
	
	OrderSystem(int OrderID){
		this.OrderID = OrderID;
		this.itemPrice = new double[0];
		totalOrders++;
	}
	OrderSystem(int OrderID,double[] itemPrice) {
		this.OrderID = OrderID;
		this.itemPrice = new double[0];
		totalOrders++;
	}
	
	static void displayPlatformStatistics() {
		
	}
	
	double getTotalItemCost() {
		double total = 0 ;
		
		for(double price : itemPrice) {
			total =+ itemPrice;
		}
		return total;
	}
}
