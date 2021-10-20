package com.yedam.java.ch0402_02;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// 1부터 10까지 출력
		int m=1;
		while(m<=10 ) {
			System.out.println(m);
			m++;
		}
		
		// 1부터 100까지 합을 출력
		int sum = 0;
		int i = 0;
		while(i<=100) {
			sum +=i;
			i++;
			// sum = sum + i++;
		}
		System.out.println(sum);
		
		int index = 1;
		
		while(index !=1) {
			
			while(index !=1) {
				System.out.println("while 반복문이" + index +"번 실행됩니다.");
			}
			do {
				System.out.println("do~while 반복문이 " + index +"번 실행됩니다.");
			} while(index !=1);
			
			while(true) {
				int num = (int)(Math.random()*6) +1;
				System.out.println(num);
				if(num ==6) {
					break;
				}
			}
			
			Outter:for(char upper = 'A'; upper<='Z'; upper++) {
				for(char lower = 'a'; lower<='z'; lower++) {
					System.out.println(upper);
					if(lower=='g') {
						break Outter;
					}
				}
			}
			
		}
		

	}

}
