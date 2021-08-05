package com.yash.removeduplicatesfromarray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yash.removeduplicatesfromarray.service.ArrayService;

@SpringBootApplication
public class RemoveDuplicatesFromArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoveDuplicatesFromArrayApplication.class, args);
		
		int duplicateArray[] = { 3,1, 1, 2, 2, 2,4,4 };
		
		int length = ArrayService.calculateLength(duplicateArray);
		System.out.println(length+".......");
		duplicateArray = ArrayService.removeduplicates(duplicateArray, length);
		// Printing The array elements
        for (int i = 0; i < length; i++)
            System.out.print(duplicateArray[i] + " ");
    }
}
