package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		long speed=300000;
		Scanner sc = new Scanner(System.in);
		System.out.println("빛이 1년 동안 가는 거리는" + speed*365*24*60*60 + "km 입니다.");
		
		sc.close();

	}

}
