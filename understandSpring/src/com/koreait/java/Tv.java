package com.koreait.java;

public abstract class Tv {
	private String brand;
	private int inch;
	private int maxChannel;
	private int maxVolume;
	private int currentChannel;
	private int currentVolume;
	private Speaker speaker;
	
	public Tv(String brand, int inch, int maxChannel,int maxVolume,Speaker speaker) {
		this.brand = brand;
		this.inch = inch;
		this.maxChannel=maxChannel;
		this.maxVolume=maxVolume;
		this.currentChannel=1;
		this.speaker=speaker;
	}

	public String getBrand() {
		return brand;
	}

	public int getInch() {
		return inch;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public int getCurrentChannel() {
		return currentChannel;
	} 

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	public void channelUp() {
		if(currentChannel==maxChannel) {
			currentChannel=1;
		}else {
			currentChannel++;
		}
		System.out.println("currentChannel : "+currentChannel);
	}
	public void channelDown() {
		if(currentChannel==1) {
			currentChannel=40;
		}else {
			currentChannel--;
		}
		
		System.out.println("currentChannel : "+currentChannel);
	}
	public void volumeUp() {
		if(this.currentVolume<this.maxVolume) {
			this.currentVolume++;
			speaker.volumeUp();
		}
		System.out.println("currentVolume: "+currentVolume);
		
	}
	public void volumeDown() {
		if(currentVolume>0) {
			currentVolume--;
			speaker.volumeDown();
		}
		System.out.println("currentVolume: "+currentVolume);
	}
	@Override
	public String toString(){
		return String.format("%s, %d인치, %d채널, %d볼륨"
				,brand,inch,maxChannel,maxVolume);
	}
}
