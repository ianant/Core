package com.prectice.array;

public class MaxElement {

	public static void main(String[] args) {
		
		int []arr= {7,3,12,8,18,6,15,11};
		int len=arr.length;
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max Value find is: "+max);

	}

}
