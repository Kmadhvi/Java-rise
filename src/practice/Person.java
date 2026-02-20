package practice;

public abstract class Person {
	protected String name;
	protected int age;
	protected String id;
	
	Person(String name,int age,String id){
		this.name = name;
		this.age = age;
		this.id= id;
	}
	
	abstract void getRole();
	

}
