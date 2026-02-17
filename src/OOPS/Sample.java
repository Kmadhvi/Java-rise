package OOPS;

public class Sample {
	int a=10;
	static int x = 90;
    Sample ()
    {
    	System.out.println("Constructor");
        
    }

    int mysample(int a,int b) {
        System.out.println(a);
        System.out.println(b);
        return 1;
    }

    void mysample(String a,String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
    static void staticmethod() {
    	System.out.println("this is static method");
    }
    
}
