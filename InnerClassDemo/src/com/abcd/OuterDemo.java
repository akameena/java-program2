package com.abcd;

public class OuterDemo {
public static void main(String[] args) {
//	System.out.println("Hi");
	InnerDemo innerDemo= new InnerDemo();
	System.out.println(innerDemo.x);
	innerDemo.show();
	NSInnerDemo innerDemo2= new OuterDemo().new NSInnerDemo();
	innerDemo2.move();
	System.out.println(innerDemo2.y);
}
static{
	
	System.out.println("I am static block");
	
}
static class InnerDemo{
	int x= 90;
	 void show() {
		// TODO Auto-generated method stub
    System.out.println("I am inner class Method");
	}
	
}

class NSInnerDemo{
	
	int y= 80;
	void move(){
		System.out.println("I am NS inner class method");
	}
	
}

}
