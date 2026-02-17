package OOPS;

public class Coffee {
	
	static int CupServed = 0;
	String CoffeeSize;
	String CoffeeType ;
	int quantity;
	
	Coffee(String CoffeeType){
		this.CoffeeType = CoffeeType;
		this.CoffeeSize= "Small";
		this.quantity = 1;
		CupServed +=  quantity;
	}
	
	Coffee(String CoffeeType, int quantity){
		this.CoffeeType = CoffeeType;
		this.quantity = quantity;
		this.CoffeeSize = "Medium";
		CupServed += quantity;
	}
	
	Coffee(String CoffeeType, String CoffeeSize ,int quantity){
		this.CoffeeType = CoffeeType;
        this.CoffeeSize = CoffeeSize;
        this.quantity = quantity;
        CupServed += quantity;
		
	}
	void displayCupServed() {
        System.out.println("Total cups served: " + CupServed);
    }
    int coffeetypeprice(){
    	int price = 0;
        if(CoffeeType.equalsIgnoreCase("Latte" )){
            price= 40;
        }
        if(CoffeeType.equalsIgnoreCase("Espresso")){
            price= 30;
        }
        if(CoffeeType.equalsIgnoreCase("Cappuccino" )){
            price= 50;
        }
        if (CoffeeType.equalsIgnoreCase("Americano") ){
            price= 20;
        }
        if (CoffeeType.equalsIgnoreCase("Mocha")){
            price= 60;
        }
        return price;
        
    }
    int CalculatePrice(String CoffeeSize) {
    	int baseprice = 30;
    	
    	if(CoffeeSize.equalsIgnoreCase("Medium")) {
    		baseprice = 70;
    	}else if (CoffeeSize.equalsIgnoreCase("Large")) {
    		baseprice = 90;
    	}
    	if(CoffeeSize.equalsIgnoreCase("Milk")) {
    		baseprice+=20;
    	}
    	return baseprice * quantity;
    }
    void calculateBill() {
    	
    	int price = coffeetypeprice();
        if ((CoffeeType == "Latte" )  || (CoffeeType == "Mocha") || (CoffeeType == "Cappuccino") ) {
            price +=20;
        } 
        if (CoffeeSize == "Medium") {
            price += 10;
        } else if (CoffeeSize == "Large") {
            price += 20;
        }
        int totalBill = price * quantity;
        System.out.println("Total Bill for " + quantity + " " + CoffeeSize + " " + CoffeeType + ": " + totalBill);
    }
	
	
	
	

}
