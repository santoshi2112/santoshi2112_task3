package com.epam.t3_Solid;

public class solid {
	public static void main(String[] args) {
		/**implements s of solid and has single responsibility
		 * of creating class objects
		 * and accessing its display
		 */
		Marks m1=new Marks("santoshi",71,72);
		m1.display();
		
	}
	}
/** here we override the required behaviors to implement open closed principle
 * we show derived class is substitutable for base class proving liskovs principle
 * and we don't implement any unnecessary methods to prove interface segregation
 * we implement d-dependency inversion using abstract class for calculating the marks
 */
	abstract class Person{
		String name;
		Person(String name){
			this.name=name;
		}
		void display() {
			System.out.println("Name is "+this.name);
		}
		abstract int avg(int a,int b);

		
	}
	class Marks extends Person{
		int a,b;
		Marks(String name,int a,int b){
			super(name);
			this.a=a;
			this.b=b;
		}
		int avg(int a,int b) {
			return (this.a+this.b)/2;
		}
		void display() {
			super.display();
			System.out.println(avg(a,b));
			
			
		}
	}
	


