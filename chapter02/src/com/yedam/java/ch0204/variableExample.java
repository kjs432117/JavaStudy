package com.yedam.java.ch0204;

import java.io.IOException;
import java.util.Scanner;

public class variableExample {
	public static void main(String[] args)  throws IOException {
		
		System.out.println("Hello World!");
		System.out.println("Today : 2021.10.15");
		
		System.out.print("Hello World!\n");
		System.out.print("Today : 2021.10.15\n");
		
		
		int x = 1;
		int y = 2;
		System.out.println("x: " + x + ", y: " + y);
		System.out.println("==================================");
		System.out.printf("x: %d, y: %d\n", x, y);
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println(keyCode);

		keyCode = System.in.read();
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode);
		
//		while(true) {
//			keyCode = System.in.read();
//			System.out.println(keyCode);
//		}
		
		
		Scanner scanner = new Scanner(System.in);		//오류남 해결해보자!!! : 위에 While 문을 주석처리하니 작동
		
		String inputData = scanner.nextLine();
		System.out.println(inputData);
	}

}
