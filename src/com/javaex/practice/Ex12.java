package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rad;
		double a;
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요.");
		rad = sc.nextInt();
		
		a = rad * rad * PI;
		System.out.println("원의 넓이는" + a);
		
		
		sc.close();
	}

}
