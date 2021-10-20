package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		
		// 기본 IF문
		int score = 90;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다.");
			
		}
		
		if(score <= 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		System.out.println("==========================");
		// IF~ELSE문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println("=========================");
		// IF ~ ELSE IF ~ ELSE 구문
		score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		}else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		}else {
			System.out.println("점수가 70미만입니다.");		//else 구문 생략 가능
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("===============");
		
		int num = (int)(Math.random() * 6 ) + 1;
		// math.random 함수는 0.0~1.0 사이의 실수를 생성한다.
		// int 자료형을 이용하여 정수형 자료로 변환한다.
		// 10을 곱해주면 0~9 까지 나오게 됨 확률 동일한것으로 생각됨.
		// 1을 더해주면 1~10까지 숫자가 나옴
		// 하지만 10을 곱하지 않고 6을 곱해줄 경우 확률은 어떻게될까 
		// 확률 동일한 것으로 판단됨
		
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
//		System.out.println("=================quiz");
//		//문제1 두개의 정수가 주어졌을 때
//		//두 정수의 합이 자연수이면 'Natural Number'를 추력하도록 구현하세요.
//		Scanner scanner = new Scanner(System.in);
//		int a;
//		int b;
//		int a1;
//		float b1;
//		float bmi;
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//
//		
//		if(a+b > 0) {
//			System.out.println("Natural Number");
//		}
//		System.out.println("=================");
//
//		//문제2 두개의 정수가 주어졌을 때
//		//두 수의 대소관계에 따라 부등호(> , = , <)를 출려가도록 구현하세요.
//		if(a>b) {
//			System.out.printf("%d>%d\n", a, b);
//		}else if(a==b) {
//			System.out.printf("%d=%d\n", a, b);
//		}else if(a<b) {
//			System.out.printf("%d<%d\n", a, b);
//		}
//		System.out.println("=================");
//
//		//문제3 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 구현하세요.
//		// BMI = 체중 / (키 * 키)
//		// 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
//		System.out.println("체중 입력(단위는 kg)\n");
//		a1 = scanner.nextInt();
//		System.out.println("키 입력(단위는 m)\n");
//		b1 = scanner.nextInt();
//		bmi = a1/(b1*b1);
//		System.out.printf("BMI = %d / (%d * %d)\n BMI지수는 %f입니다.\n", a1, b1, b1, bmi);
//
//		
//		if(bmi<18.5) {
//			System.out.println("저체중\n");
//		}else if(bmi<25 & bmi>=18.5) {
//			System.out.println("정상\n");
//		}else if(bmi<30 & bmi>=25) {
//			System.out.println("과체중\n");
//		}else if(bmi>=30) {
//			System.out.println("비만\n");
//		}else {
//			System.out.println("erorr");
//		}
//		
		System.out.println("=================");
		int random = (int)(Math.random()*6) + 1;
		
		switch(random) {
		case 1:
			System.out.println("1번이 나왔습니다.");		//case 구문은 break가 필요
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");		//위의 모든 구문의 실행이안될경우 실행, break 구문 필요없음, 생략가능
		}
		
		int time = (int)(Math.random() *4) + 8;
		System.out.println("현재시각 : " + time + "시");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
		default:
			System.out.println("손님입니다.");
				
		}
		
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
		
		System.out.println("====================quiz");
		//문제4 구구단을 출력하되 입력받은 단의 6번째 값을 출력하도록 구현하세요.
		//예를 들어, 2단 일 경우에 2 x 6 = 12
		//출력문에는 변수를 사용하지 않습니다.
		
		Scanner scn = new Scanner(System.in);
		int a2;
		a2 = scn.nextInt();
		
		switch(a2) {
		case 1:
			System.out.println("1 x 6 = 6");
			break;
		case 2:
			System.out.println("2 x 6 = 12");
			break;
		case 3:
			System.out.println("3 x 6 = 18");
			break;
		case 4:
			System.out.println("4 x 6 = 24");
			break;
		case 5:
			System.out.println("5 x 6 = 30");
			break;
		case 6:
			System.out.println("6 x 6 = 36");
			break;
		case 7:
			System.out.println("7 x 6 = 42");
			break;
		case 8:
			System.out.println("8 x 6 = 48");
			break;
		case 9:
			System.out.println("9 x 6 = 54");
			break;
		default:
			System.out.println("1~9의 숫자를 입력하세요");
			
		}
		
		//문제5 다음과 같이 점수 범위에 따라 등급을 구분하여 입력받은 점수에 대한 등급을 출력하도록 구현하세요.
		//단, 점수 범위는 0~100점이고
		//90점 이상 100점 이하 a
		//80점 이상 90점 미만 b
		//70점 이상 80점 미만 c
		//60점 이상 70점 미만 d
		//60점 미만 e
		int a3;
		a3 = scn.nextInt();
		
		a3 /= 10; 
		
		switch(a3) {
		case 10:
		case 9:
			System.out.println("A등급입니다.");
			break;
		case 8:
			System.out.println("B등급입니다");
			break;
		case 7:
			System.out.println("C등급입니다");
			break;
		case 6:
			System.out.println("D등급입니다");
			break;
		default:
			System.out.println("E등급입니다");
		}

		
		
	}
		
		
}


