package OOPS;
enum FoodType{
	Veg,
	Non_Veg,
	Vegan;
}
public class Food_order {
	
	FoodType foodtype;
	int order_id;
	String items[];
	
	Food_order(FoodType foodtype,int order_id, String items[]){
		this.foodtype = foodtype;
		this.order_id = order_id;
		this.items = items;
	}
	
	void display() {
		System.out.println("Order ID :" + " " + order_id);
		System.out.println("Foodtype : " +" " + foodtype);
		System.out.println("Items : ");
		for (String i:items) {
			System.out.println(i);
		}
		System.out.println("Total bill : "+calculateBill(12,34,56));
	}
	
	double calculateBill(double ...price) {
		double total = 0;
		for(double i : price) {
			total = i + total;
		}
//		for(int i =0; i< price.length; i++) {
//			total += price[i];
//		}
		//System.out.println(total);
		return total;

		
		
	}
	
}
