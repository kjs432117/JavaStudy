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
		System.out.println("========================");
		int[] temp = {89,90,93};
		int[][] javaScores = { {95,80},{92,96,80}};
		// { 1차원 배열, 1차원 배열}
		// {95,80},{92,96,80}}
		
		// -> {95,80} / {92,96,80}
		for(int x=0; x< javaScores.length; x++)
			//int[] java = javaScores[x];
		for(int y=0; y<javaScores.length; y++) {
			int ja = javaScores[x][y];
			System.out.println(ja);
		}
		
		int[] oldIntArray = {1,22,3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		
		// System/arraycopy();
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
	      
		for(int i=0; i<newStrArray.length; i++) {
		 System.out.println(newStrArray[i]);
		}
		
		 // 합과 평균 구하기
		int[] scoresList = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score : scoresList) {  //scoreList부터
			System.out.println(score);
			sum += score;
		}
		System.out.println("총 합: " + sum);
		double avg = (double) sum / scoresList.length;
		System.out.println("평균 : " + avg);
				
				
		
		
	}

}
