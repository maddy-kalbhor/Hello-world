package com.psl.training;

import java.util.ArrayList;
import java.util.List;
import  java.util.ArrayList;
public class Search {
  //  static int array[]={1,2,3,4,5};
	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println("List contain value?:"+list.contains(3));
	
		

	/*	// TODO Auto-generated method stub
		boolean key=Search.findPosition(array,3);
		if(key==true)
		{
			System.out.println("Num is found");
		}
		else
		{
			System.out.println("Not found");
		}

	}


static boolean findPosition(int[] nos,int num)
{
	for(int temp:nos)
	{
		if(temp==6)
		{
			return true;
		}
	}
	return false;*/
}
}
