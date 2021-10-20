package com.yedam.java.homework;

public class Homework {
	public static void main(String[] args) {
		
		System.out.println("=========추가문제==========");
		
		int value = 485;
		
		int hundred = value / 100;
		int ten = (value - (hundred * 100)) / 10;
		int one = value - (hundred*100) - (ten*10); 
		
		System.out.println(hundred + ten + one);
		
	}
}
