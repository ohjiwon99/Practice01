package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double money;
		double price;
	    double vat;
	    double change;

	    System.out.print("상품가격: "); 
	    money = sc.nextInt();
	    
	    System.out.print("받은돈: ");
	    price = sc.nextInt();
	    
	    System.out.println("==========");
	    
	    vat = (int) (money*0.1);
	    change = price - money;

	    System.out.println("받은돈: " + price);
	    System.out.println("상품가격: " + money);	    
	    System.out.println("부가세: " + vat);
	    System.out.println("잔액: " + change);
		
		
		
		
		
		sc.close();
		
		

	}

}
