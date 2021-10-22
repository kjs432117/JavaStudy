package com.yedam.java.ch0604;

public class MemberService {
	
	String id;
	String password;
	
	boolean isLogin() {
		if(id == "hong" & password == "12345") {
			System.out.println("로그인 성공");
			return true;
		} System.out.println("로그인 실패");
		return false;
	}
	
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
	
}
