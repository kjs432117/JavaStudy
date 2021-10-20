package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {
	
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+"+ num2 +"=" + result);
		
		int[][] scores = new int[2][3];
		
		int[] score1 = new int[3];
		int[] score2 = new int[3];
		// int[] -> 타입
		
//		int[][] scoreArray = new int[][2];
//		scoreArray[0] = score1;
//		
		int[][] mathScores = new int[2][3];
		System.out.println(mathScores);

		
		for(int x=0; x<mathScores.length; x++) {
			System.out.println(mathScores[x]);
			int[] temp = mathScores[x];
			for(int y=0; y<temp.length; y++) {
				System.out.println(temp[y]);
			}					
		}		
		
		for(int x=0; x<mathScores.length; x++) {
			System.out.println(mathScores[x]);
			//int[] temp = mathScores[x];
			for(int y=0; y<mathScores[x].length; y++) {
				System.out.println(mathScores[x][y]);
			}					
		}
		
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[5];
		englishScores[1] = new int[3];
		System.out.println(englishScores.length);
		for(int x=0; x<englishScores.length; x++) {
			System.out.println();
			System.out.println(englishScores[x].length);
			for(int y=0; y<englishScores[x].length; y++) {
				System.out.println(englishScores[x][y]);
				
			}
		}
		
				
				
				
		
		
	}

}
