package com.psl.training;

public class TicTocToe {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char [][]matrix=new char[3][3] ;
      String win,lose;
     
      matrix[0][0]='X';
      matrix[0][1]='X';
      matrix[0][2]='X';
      matrix[1][0]='X';
      matrix[1][1]='O';
      matrix[1][2]='X';
      matrix[2][0]='O';
      matrix[2][1]='X';
      matrix[2][0]='O';
    	  
      TicTocToe.win(matrix);
   //   System.out.println(result);
      }
	 public static void win(char[][]matrix){
		 if(matrix[0][0]=='X' && matrix[0][1]=='X' && matrix[0][2]=='X')
		 {
			 System.out.println("win");
		 }
		 
		 else if(matrix[1][0]=='O' && matrix[1][1]=='O' && matrix[1][2]=='O')
		 {
			 System.out.println("O win");
		 }
		 else if(matrix[2][0]=='X' && matrix[2][1]=='X' && matrix[2][2]=='X')
		 {
			 System.out.println("win");
		 }
		 else if(matrix[0][0]=='X' && matrix[1][0]=='X' && matrix[2][0]=='X')
		 {
			 System.out.println("win");
		 }
		 else if(matrix[0][1]=='X' && matrix[1][1]=='X' && matrix[2][1]=='X')
		 {
			System.out.println("win");
		 }
		 else if(matrix[0][2]=='X' && matrix[1][2]=='X' && matrix[2][2]=='X')
		 {
			 System.out.println("win");
		 }
		 else if(matrix[0][0]=='X' && matrix[1][1]=='X' && matrix[2][2]=='X')
		{
			 System.out.println("win");
		 }
		 else if(matrix[0][2]=='X' && matrix[1][1]=='X' && matrix[2][0]=='X')
			 {
				 System.out.println("win");
			 }
		 else
		 {
			 System.out.println("lose");
		 
		 }
		 
		 
		 
   
	}

}
