package com.yedam.java.ch0202;

public class variableExample {

	public static void main(String[] args) {
		
		//중간실습 자료형 수정하기
		//byte var1 = 200;		//200
		int var1 = 200;
		//char var2 = 'AB';		//AB
		String var2 = "AB";
		//String var3 = 65;		//A로 출력되도록. -> p.64
		char var3 = 65;
		//int var4 = 50000000000;	//500000000000
		long var4 = 50000000000L;
		//float var5 = 3.14;		//3.14
		float var5 = 3.14F;
		//long var6 = 100.0;		//100.0
		double var6 = 100.0;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		/*
		int var1 = 365;
		int var2 = 0b1011;	//2진수
		int var3 = 0xB3;	//16진수
		int var4 = 0206;	//8진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		*/
		
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		//byte v5 = 128;
		byte v5 = 127;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	
		long lv1 = 10;
		long lv2 = 300000000000L; //long 타입 마지막 L 붙여야됨 공부하기!!!!!! 이해못함!!! test
		
		char ch1 = 'A';
		//char ch2 = '홍길동';	// 문장이기때문에 못담음
		String str = "홍길동";	// 문장이기때문에 "" 에 담음
		//char ch2 = "A";		// ""은 문장으로 인식해서 오류
		String str1 = "A";
		
		float f1 = 3.14F;		// float 마지막 F 붙여야됨 공부하기!!!!!!! 이해못함!!! double 기본으로 인식 정밀도높음
		double d1 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println("f1:" + f1 + ", d1: " + d1);
		System.out.println("varF:" + varF + ", varD:" + varD);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}
		boolean stop1 = false;
		if(stop1) {
			System.out.println("중지합니다");
		}
	
	
	}
	
}
