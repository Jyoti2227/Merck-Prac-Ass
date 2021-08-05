package com.yash.removeduplicatesfromarray.service;

public class ArrayService {

	public static int calculateLength(int[] duplicateArray) {
		int length = 0;
		for(int number : duplicateArray)
		{
			length ++;
		}
		return length;
	}

	public static int[] removeduplicates(int[] duplicateArray, int length) {
		
		
		  if (length == 0 || length == 1)
		  { 
			  return duplicateArray ; 
		  }
		 
		
		// creating another array for only storing the unique elements
		int[] temp = new int[length];
		int j = 0;
		int count=0;
		for(int i = 0 ; i < length-1 ; i++)
		{
			if(duplicateArray[i] != duplicateArray[i+1])
			{
				temp[j++] = duplicateArray[i];
				count++;
			
			}
		
			
		}
		System.out.println(count+"Count");
		
		temp[j++] = duplicateArray[length-1];
		duplicateArray = new int[count+1];
		//Changing the original array
		for(int i = 0 ; i < j ; i++)
		{
			if(temp[i]!=0) {
				System.out.println(temp[i]+".............In Service");
				 duplicateArray[i] = temp[i];
			}
		}
		
		return duplicateArray;
	}

}
