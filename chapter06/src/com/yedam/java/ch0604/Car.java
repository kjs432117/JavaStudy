package com.yedam.java.ch0604;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		if(gas >=0) {
			
			this.gas = gas;
		}else {
			this.gas = gas;
		}
	}
	
	int getGas() {
		return this.gas;
	}
	
	boolean isLeftGas() {	//boolean 타입 시에 is~~ 라는 메소드이름 사용
		if(gas == 0) {		//if 구문 사용시 return 여러개일수 있음
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -=1;
			}else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return;
						
			}
		}
		
	}
	
	
	
	
	
	
}
