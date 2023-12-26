package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("원화를 입력하세요");
		int w = Integer.parseInt(sc.nextLine());
		
		double usd = 123095;
		double exchange = w/usd;
		
		System.out.println("입력한 원화는"+exchange+"달러로 환전됩니다");
		sc.close();*/
		
		
		System.out.print("원화를 입력하세요:");
		int w;
		w = sc.nextInt();
		
		double usd = 123095;
		double exchange = w / usd;	
		System.out.println("입력한 원화는"+exchange+" 달러로 환전됩니다");
		sc.close();
		//한번 더 확인해보기
		
		

		
		

	}

}
