package com.k2webtech.springboot.app.service;

import org.springframework.stereotype.Service;

import com.k2webtech.springboot.app.advice.TrackExecutionTime;

@Service
public class NumberConversion {
	
	@TrackExecutionTime
	public void convertNumberDecimalToBinary(int n) {
		int[] binaryNumbers = new int[32];
		int i = 0;
		while (n > 0) {
			binaryNumbers[i] = n % 2;
			n = n / 2;
			i++;
		}
		System.out.print("Binary number result: ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNumbers[j]);
		}
		System.out.println();
	}
	
}
