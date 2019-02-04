package com.psl.training;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num[]={1,2,3,4,5,6,7,8,9};
   int key=3;
   boolean found=false;
    for(int temp:num){
    	if(key==temp){
    		found=true;
    		break;
    	}
    		
    }
    if(found){
    System.out.println("found in array:"+key);
    }
    else{
    	System.out.println(-1);
    }
	}

}
