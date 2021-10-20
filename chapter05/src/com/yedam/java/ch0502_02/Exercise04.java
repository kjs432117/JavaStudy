package com.yedam.java.ch0502_02;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2,10,100,5,3000};
		
		//작성 위치
		for(int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				
			}
			
		}
		System.out.println("max: " + max);
		
		System.out.println("===================");
		//추가문제 책161페이지 3번 변형
		//while문과 math.random()함수를 이용해서 2개의 자사위를 던졌을 때 나오는 숫자를
		// (숫자1,숫자2) 형태롤 출력하고,
		// 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		//또한 주사위를 몇번 던졌는지 횟수를 출력하ㅔㅅ요.
		// 숫자의 합이 5가 되는 조합은 (1,4),(4,1),(2,3),(3,2) 
		int count = 0;
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			count++;
			int result = dice1 + dice2;
			if(result == 5) {
				System.out.printf("%d,%d\n",dice1,dice2);
				System.out.println(count);
				break;
			}
				
		}
		
		
		

	}
}
