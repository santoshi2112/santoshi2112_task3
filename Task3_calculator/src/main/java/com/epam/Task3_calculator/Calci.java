package com.epam.Task3_calculator;

import java.util.Scanner;

public class Calci {
	public static void main(String[] arg) {
		int ch;
		Scanner sc= new Scanner(System.in);
		int ans=1;
		do {
		System.out.println("Enter choice \n 1.add \n 2.sub \n 3.multiply \n 4.div");
		ch=sc.nextInt();
		System.out.println("Enter operands a and b");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		if(ch==1) {
			System.out.println(a+b);
		}
		else if(ch==2){
			System.out.println(Math.abs(a-b));
		}
		else if(ch==3){
			System.out.println(a*b);
		}
		else if(ch==4){
			try {
			System.out.println(a/b);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Enter valid option");
		}
		System.out.println("do you want to continue yes(1)/no(0)");
		ans=sc.nextInt();
		}while(ans==1);
		System.out.println("Closed");
		
		sc.close();
		
	}

}
