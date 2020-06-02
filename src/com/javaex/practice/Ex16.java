package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int getMoney;
		int price;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		price = sc.nextInt();
		
		System.out.print("받은돈: ");
		getMoney = sc.nextInt();
		
		System.out.println("======================");
		
		System.out.println("받은돈 : " + getMoney);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + price*0.1);
		System.out.println("잔액: " + price);
		
		
		
		sc.close();

	}

}
