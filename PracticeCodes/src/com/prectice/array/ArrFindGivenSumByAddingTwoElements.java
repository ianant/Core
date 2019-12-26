package com.prectice.array;

import java.util.Arrays;

public class ArrFindGivenSumByAddingTwoElements {

	public static void main(String[] args) {
		
		int arr[]= {1,4,45,6,10,-8};
		int len=arr.length;
		String result=findElements(arr,len);
		System.out.println(result);
	}
	
	
	public static String findElements(int arr[],int len) {
		int sum=89;
		int left=0;
		int right=arr.length-1;
		Arrays.sort(arr);
		while(right>left) {
			if(arr[left]+arr[right]==sum) {
				 return "elements are: "+arr[left]+":"+arr[right];
			}
			else if(arr[left]+arr[right]<sum) {
				left++;
			}
			else
				right--;
		}

		return "Elements not found";
	}
}

