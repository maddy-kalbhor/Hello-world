package com.psl.training;

import java.util.List;
import java.util.ArrayList;


public class Product {
 // static String productAvailable[] = {"tea","coffee","coldDrink"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<>();
		list.add("tea");
		list.add("coffee");
		list.add("colddrink");
		list.add("Biscuit");
		list.add("Soup");
		System.out.println("List contains the Product? tea:"+list.contains("tea"));
	
		
		
		
    /*  boolean result=Product.isPresent(productAvailable,"coffee");
      if(result==true)
      {
    	  System.out.println("Item is found ");
      }
    	  else
    	  {
    		  System.out.println("Item not found");
    	  }
      }
	


static boolean isPresent(String[] productName,String keyword)
{
	for(String tempProduct:productAvailable)
	{
		if(tempProduct.contains(keyword))
		{
			return true;
		}
	}
	return false;
	}
	
	*/
	}
}