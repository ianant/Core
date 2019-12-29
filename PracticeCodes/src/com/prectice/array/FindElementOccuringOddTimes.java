package com.prectice.array;

public class FindElementOccuringOddTimes {

	public static void main(String[] args) {
		
		int [] arr= {5, 7, 2, 7, 5, 2, 5};
		int len=arr.length;
		String result=findElement(arr,len);
		System.out.println(":::"+result+":::");
	}
	public static String findElement(int []arr,int len) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					index=arr[i];
					
					if(count%2!=0) {
						return "element found: "+index;
					}
				}
				
			}
		}
		return "no such elements";

	}
}


