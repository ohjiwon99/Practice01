package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		System.out.println("가로를 입력하세요:");
		a = sc.nextDouble();
		System.out.println("세로를 입력하세요:");
		b = sc.nextDouble();
		double c = a*b;
		double d = 2*(a+b);
		
		System.out.println("사각형의 넓이는 "+c);
		System.out.println("사각형의 둘레는 "+d);
		
		sc.close();
		

	}

}
