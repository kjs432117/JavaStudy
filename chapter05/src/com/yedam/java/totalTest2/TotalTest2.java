package com.yedam.java.totalTest2;

import java.util.Scanner;

public class TotalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서 
		//       최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		//  1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
		// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다. 
		//    예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		
		outter:while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료:");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1:
				System.out.println("상품 수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i<scores.length; i++) {
					System.out.printf("[%d]번째 제품>\n",i+1);
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i<scores.length; i++) {
					System.out.printf("[%d]번째 제품:%d\n",i+1,scores[i]);
				}
				break;
			case 4:
				//아래는 내가 짠 코드
				double a = 0;
				double b = 0;
				int e = 0;
				int c = 0;
				double d = scores.length;
				for(int i = 0; i<scores.length; i++) {
					if (c<scores[i]) {
						c=scores[i];
					}
					a += scores[i];
				}
				for(int j = 0; j<scores.length; j++) {
					if(c==scores[j]) {
						System.out.printf("최고 가격 제품은%d\n",j+1);
						e += scores[j];
					}			

				}
				b = a-e;
				System.out.printf("나머지 가격 합:%f\n",b);
				break;
				//여기부터는 선생님이 짠 코드
//				
//				int index = 0;
//				int sum = 0;
//				for(int i=0; i<scores.length; i++) {
//					if(scores[i] == max) {
//						index = i+1;
//						continue;
//					}
//					sum += scores[i];
//				}
			case 5:
				System.out.println("프로그램 종료");
				break outter;
				
				
				
				
			}
			
		}
	}

}
