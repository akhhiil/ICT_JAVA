package com.ukf;

public class Test1 {
	
	public static void ageValid(int age) throws Exception{
		if(age<0) {
			throw new Exception("Age Invalid");
			
		}
		System.out.println(age);
	}
	public static void main(String[] args) {
		try {
			ageValid(-9);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
