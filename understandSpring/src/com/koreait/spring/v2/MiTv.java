package com.koreait.spring.v2;

import com.koreait.java.Speaker;

public class MiTv {
	private Speaker speaker;
	
	public MiTv() {
		System.out.println("MiTv 기본 생성자");
	}
	
	public MiTv(Speaker speaker) {
		System.out.println("MiTv speaker 생성자");
		this.speaker=speaker;
	}
}
