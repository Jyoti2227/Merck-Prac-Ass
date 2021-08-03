package com.example.oddevennojunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.oddevennojunitdemo.serviceimpl.CheckEvenOddServiceImpl;

class CheckEvenOddServiceImplTest {
	
	//Positive value check
	@Test
	void testCheckEvenOddNo() {
		assertEquals("The entered number 4 "+  "is: even",CheckEvenOddServiceImpl.checkEvenOddNo(4));
		assertEquals("The entered number 5 "+  "is: odd",CheckEvenOddServiceImpl.checkEvenOddNo(5));
	}
	
	
	
	//Null value check 
	@Test
	public void testCheckEvenOddNoThrowsException() {
		assertThrows(NullPointerException.class,() -> CheckEvenOddServiceImpl.checkEvenOddNo(null)); 
	}
}

