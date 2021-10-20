package com.yedam.java.totalTest;

import java.util.Scanner;

public class TotalTest {
	public static void main(String[] args) {
		//문제 다음은 키보드로부터 하생 수와 각 학생들의 점수를 입력받아서
		//최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행 결과를 보고 알맞게 작성해보세요.
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		outter:while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료:");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1:
				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i<scores.length; i++) {
					System.out.printf("scores[%d]>\n",i);
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i<scores.length; i++) {
					System.out.printf("scores[%d]:%d\n",i,scores[i]);
				}
				break;
			case 4:
				double a = 0;
				double b = 0;
				int c = 0;
				double d = scores.length;
				for(int i = 0; i<scores.length; i++) {
					if (c<scores[i]) 
						c=scores[i];

					a += scores[i];
					b = a/d;
				}
				System.out.printf("최고 점수:%d\n",c);

				System.out.printf("평균 점수:%f\n",b);
				break;
			case 5:
				System.out.println("프로그램 종료");
				break outter;
				
				
				
				
			}
			
		}
	}

}
