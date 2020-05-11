package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i =10;
		int n = ++i %2; //11출력 11%2는 몫 5 나머지 1
		
		System.out.println(i); //11 처음에는 10인줄 알았으나 결과값은 n부분을 다 마친 후 결과값이 나오기 때문에 값은 11.
		System.out.println(n); //1
	}

}
