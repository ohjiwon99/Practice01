package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		
		System.out.println("가로:");
		a = sc.nextDouble();
		
		System.out.println("세로:");
		b = sc.nextDouble();
		
		double c = a*b/2; //밑변*높이/2
		
		System.out.println("삼각형의 넓이는 "+c+"입니다.");
		
		sc.close();
		

	}

}
