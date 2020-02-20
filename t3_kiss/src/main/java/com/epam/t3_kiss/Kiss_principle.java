package com.epam.t3_kiss;

import java.util.Scanner;

public class Kiss_principle {
	public static void main(String[] args) {
	/**
	 to print SQAURES n natural nos we just need one loop to keep it simple
	 rather than printing n println statements
	 */
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("Square nos between i and "+n+" are");
		for(int i=1;i<=n;i++) {
			System.out.println(i+"square is:"+(i*i));
		}
		sc.close();
		
		
		
}
}