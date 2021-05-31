package com.koreait.java;

public class Speaker {
	private String brand;
	private int maxVolume;
	private int currentVolume;
	
	public Speaker(String brand, int maxVolume) {
		super();
		this.brand=brand;
		this.maxVolume = maxVolume;
	}
	
	public String getBrand() {
		return brand;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void volumeUp() {
		if(this.currentVolume<this.maxVolume) {
			this.currentVolume++;
		}
		System.out.printf("%s - speaker : %d\n",brand,currentVolume);
	}
	public void volumeDown() {
		if(this.currentVolume>0) {
			this.currentVolume--;
		}
		System.out.printf("%s - speaker : %d\n",brand,currentVolume);
	}
	
}
