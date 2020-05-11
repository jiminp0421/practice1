package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 10;
		int n = i++ %2; // 10-->11 11%2 = 1 (x)
						// 11이나 출력이 아직 안됐으므로 10 
						// 10%2 는 몫 5 나머지 0 그럼으로 0
		
		System.out.println(i); //11
		System.out.println(n); //0
		
		
	}

}
