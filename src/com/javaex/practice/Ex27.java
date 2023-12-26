package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요:");
		
		double r = Integer.parseInt(sc.nextLine());
		double radius = r*r;
		double pie = 3.14;
		double s = radius * pie;
		System.out.println("원의 넓이는"+s+"입니다");
		
		sc.close();
	
		

	}

}
