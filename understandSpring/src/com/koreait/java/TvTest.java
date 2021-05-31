package com.koreait.java;

public class TvTest {

	public static void main(String[] args) {
		Tv lgtv = new LgTv(new AppleSpeaker(40));
		Tv samtv = new SamsungTv(new SonySpeaker(30));
		
		System.out.println(lgtv);
		System.out.println(samtv);
		
		for(int i=0;i<42;i++) {
			lgtv.volumeDown();
		}
		System.out.println();
		for(int i=0;i<42;i++) {
			lgtv.volumeUp();
		}
		
	}
}
