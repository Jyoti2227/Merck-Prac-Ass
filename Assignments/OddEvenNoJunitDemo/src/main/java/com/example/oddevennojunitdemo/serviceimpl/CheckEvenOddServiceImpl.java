package com.example.oddevennojunitdemo.serviceimpl;

public class CheckEvenOddServiceImpl{

	
	public static String checkEvenOddNo(Integer num) {
		
		String check = (num % 2 == 0) ? "even" : "odd";
		String msg = "The entered number "+ num + " is: " + check;
		System.out.println(msg);
		return msg;
	}

}
