package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("마일을 입력하세요:");
		double mile;
		double km;
		
		mile = sc.nextDouble();
    	km = 1.609 * mile;
    	System.out.println(mile + "마일은 " + km + "킬로미터 입니다.");	
		
		sc.close();

	}

}
