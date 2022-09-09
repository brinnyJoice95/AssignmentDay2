package week1.day2;

import java.util.Arrays;

public class SmallestArray {
	public static void main(String[] args) {
		int[] arr = {23,45,67,32,89,22};
		
		Arrays.sort(arr);
		System.out.println("Sorted array "+Arrays.toString(arr));
		int small = arr[0];
		System.out.println("Smallest number is "+small);
		
		
	
	}

}
