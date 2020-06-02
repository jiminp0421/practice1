package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
	
		double r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		r = sc.nextDouble();
		System.out.println("구의부피는" + r*r*r*3.14*4/3 + "입니다.");
	}

}
