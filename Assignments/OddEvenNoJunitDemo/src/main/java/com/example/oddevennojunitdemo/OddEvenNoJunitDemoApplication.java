package com.example.oddevennojunitdemo;

//import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oddevennojunitdemo.serviceimpl.CheckEvenOddServiceImpl;

@SpringBootApplication
public class OddEvenNoJunitDemoApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		SpringApplication.run(OddEvenNoJunitDemoApplication.class, args);
		
		System.out.println("Enter an Integer number:");

		try (Scanner input = new Scanner(System.in)) {
	    	String str =input.nextLine();
	    	
	    	if(str.equals("null") || str.isEmpty())
			{
				throw new NullPointerException("Null parameters are not allowed");
			}
	    	else {
	    		//int num = input.nextInt();
	    		Integer num = null;
	    		try {
	    			num = Integer.parseInt(str);
	    		}
	    		catch (Exception e) {
	    			throw new NullPointerException("Value is out of range.");
				}
				//InputMismatchException
	    		CheckEvenOddServiceImpl.checkEvenOddNo(num);
			}
			
			
			
		}   
	}

}
