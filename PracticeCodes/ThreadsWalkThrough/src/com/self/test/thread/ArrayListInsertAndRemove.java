package com.self.test.thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListInsertAndRemove  {

	List <Integer> list=new ArrayList<Integer>();
	
	public void additionList() throws InterruptedException {
		for(int i=0;i<5;i++) {
			list.add(i);
			System.out.println("Added value: "+i);
			Thread.sleep(1000);
		}
	}
	
	public void removeList() throws InterruptedException {
		for(int i=0;i<5;i++) {
			list.remove(i);
			System.out.println("Removed Value: "+i);
			Thread.sleep(1000);
		}
	}
	
}
