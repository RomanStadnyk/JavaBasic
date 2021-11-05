package com.syntax.homework.class11;
		
		//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
public class Phone {
	String brand;
	String model;
	String color;
	String processor;
	String operatingSystem;
	int storage;
	int ram;
	boolean sensor;
	
	void Calling() {
		System.out.println(brand+" is able to give and recive calls");
			}
	void sendMessage() {
		System.out.println(brand+" is able to give and recive text messages");
			}
	void playingGame() {
		if(brand.equals("Nokia")) {
			System.out.println("You can play Snake");
		} else {
			System.out.println("You can play Candy Crash");
		}
	}
	void gps() {
		if(brand.equals("Nokia")) {
			System.out.println("There is no GPS bro. Have to figure out the way back home on your own.");
		} else {
			System.out.println("You are able to use GPS and building a route back home by "+brand);
		}
	}
	
	public static void main(String[] args) {
		
		Phone iPhone= new Phone();
		iPhone.brand="Apple iPhone";
		iPhone.model="13 Pro";
		iPhone.color="Black";
		iPhone.processor="A15 Bionic";
		iPhone.operatingSystem="IOS 15";
		iPhone.storage=512;
		iPhone.ram=6;
		iPhone.sensor=true;
		
		System.out.println("You have bought "+iPhone.brand+" "+iPhone.model+". The color is "+iPhone.color+".");
		System.out.println("Processor - "+iPhone .processor);
		System.out.println("RAM - "+iPhone .ram+" GB");
		System.out.println("Internal Storage - "+iPhone .storage+" GB");
		if (iPhone.sensor) {
			System.out.println("It has a touch screen.");
								}
		
		iPhone.Calling();
		iPhone.sendMessage();
		iPhone.playingGame();
		iPhone.gps();
	
	System.out.println("***************************************************");
	
	Phone Android= new Phone();
	Android.brand="Samsung";
	Android.model="Galaxy S20";
	Android.color="Blue";
	Android.processor="Octa-core";
	Android.operatingSystem="Android 10";
	Android.storage=256;
	Android.ram=8;
	Android.sensor=true;
	
	System.out.println("You have bought "+Android.brand+" "+Android.model+". The color is "+Android.color+".");
	System.out.println("Processor - "+Android .processor);
	System.out.println("RAM - "+Android .ram+" GB");
	System.out.println("Internal Storage - "+Android .storage+" GB");
	if (Android.sensor) {
		System.out.println("It has a touch screen.");
							}
	
	Android.Calling();
	Android.sendMessage();
	Android.playingGame();
	Android.gps();
	
System.out.println("***************************************************");
	
	Phone Nokia= new Phone();
	Nokia.brand="Nokia";
	Nokia.model="3310";
	Nokia.color="Gray";
	Nokia.processor="One-core";
	Nokia.operatingSystem="Nokia Series 30+";
	Nokia.storage=16;
	Nokia.ram=256;
	Nokia.sensor=false;
	
	System.out.println("You have bought "+Nokia.brand+" "+Nokia.model+". The color is "+Nokia.color+".");
	System.out.println("Processor - "+Nokia .processor);
	System.out.println("RAM - "+Nokia .ram+" MB");
	System.out.println("Internal Storage - "+Nokia .storage+" MB");
	if (Nokia.sensor) {
		System.out.println("It has a touch screen.");
							} else {
								System.out.println("No touch screen! You have to use buttons bro");
							}
	
	Nokia.Calling();
	Nokia.sendMessage();
	Nokia.playingGame();
	Nokia.gps();
	
	
	}

}
