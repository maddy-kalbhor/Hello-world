package com.psl.training;
import java.util.List;
import  java.util.ArrayList;

public class FindPrime {
   
	
	static void findprime(int l,int r)//l and r are the lower & upper range
	{
		List <Integer> list = new ArrayList<>();
		int  i=0,j,flag =0;
		for(i=l;i<=r;i++)
		{ 
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag =0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
			if (flag==1)
			{   
				
				System.out.println(i);
			}
		}
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPrime.findprime(20,40);
		
	
		
		
		
	}

}
