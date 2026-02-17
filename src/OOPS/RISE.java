package OOPS;

public class RISE {

    int rollno;
    String name;
    String spec;

    RISE(int a , int b){  // Constructor   
        System.out.println(a+b);
        //System.out.println("This is RISE class");
    }

    void Getdetails(int rollno, String name, String spec){
        this.rollno = rollno;
        this.name = name;
        this.spec = spec;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + spec);
    }
}
