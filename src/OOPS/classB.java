package OOPS;

public class classB extends classA {

	
	  classB(int a,int b){ 
		  super(11,6); 
		  System.out.println(a*b); 
	}
	 

	void FeatureB1() {
		System.out.println("Feature of the class B");
	}

	void FeatureB2() {
		System.out.println("Another feature of the class B");
	}

	// runtime polymorphisam is method overriding
	void add(int x, int y) {
		System.out.println("Class B : " + " " + x * y);
		super.add(34, 2);
	}

}
