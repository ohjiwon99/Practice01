package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월급을 입력하세요:");
		int Wage = Integer.parseInt(sc.nextLine());
		
		int month = 12;
		int year = 10;
		int total = month * year;
		System.out.println("10년 동안의 월급은"+total*Wage+"입니다.");
				
				
				
				
				
				sc.close();
		
		

	}

}
