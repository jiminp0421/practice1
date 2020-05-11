package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double money;
		double change;
		final double dol = 1230.95;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("환전할 원화를 입력하세요:");
		money = sc.nextDouble();
		
		change = money/dol;
		System.out.println("받으실 달러는" + change);
		
		
		sc.close();
	}

}
