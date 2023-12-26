package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		/*[참고] ℃ : 섭씨 기호 , ℉ : 화씨 기호
		     화씨->섭씨 ℃ = 5/9 * (℉ - 32) 
		     섭씨->화씨 ℉ = (℃ * 9/5) + 32 
		     */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨: ");
		double f = sc.nextDouble(); //섭->화
		double c = (5.0/9.0)*(f-32.0); //화->섭
		System.out.println("화씨 "+f+" 의 섭씨온도는 "+c+" 입니다.");
		
		
		
		
		sc.close();
		
		

	}

}
