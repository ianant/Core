package com.prectice.array;

/*Reverse character array without affecting special character in single loop.*/

public class ReverseCharArr {

	public static void main(String[] args) {
		char [] arr1= {'a','h','%','b','#','i'};
		reverse(arr1);
		String rev=new String(arr1);
		System.out.println(rev);
		
	}
	public static void reverse(char []arr1) {
		int left=0;int right=arr1.length-1;
		while(right>left) {
			if(!Character.isAlphabetic(arr1[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(arr1[right])) {
				right--;
			}
			else {
				char temp=arr1[left];
				arr1[left]=arr1[right];
				arr1[right]=temp;
				left++;
				right--;
			}
		}
	}


}
