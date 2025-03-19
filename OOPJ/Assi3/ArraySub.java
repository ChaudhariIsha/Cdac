
import java.util.*;
class ArraSub{
   public static void main(String args[]){
   
    Scanner scn = new Scanner(System.in);
  
  int a1[][] = new int[3][3];
  int a2[][] = new int[3][3];
  int a3[][] = new int[3][3];
  
   for(int i=0;i<3;i++){
      for(int j =0;j<3;j++){
	    System.out.println("Enter the element");
	    a1[i][j]=scn.nextInt();
	 }
     }
	System.out.println("second array:");
    for(int i=0;i<3;i++){
       for(int j =0;j<3;j++){
	      System.out.println("Enter the element");
	        a2[i][j]=scn.nextInt();
	  }
	  }
	
	for(int ar[] : a1)
		{
		for(int x : ar)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
		
	for(int ar[] : a2)
		{
		for(int x : ar)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
	
	
     for(int i=0;i<3;i++)
	    {
         for(int j =0;j<3;j++){
	         
			a3[i][j] = a1[i][j] - a2[i][j] ;
	  
	          }
	          }
     System.out.println("Substraction of two matrix:");

     for(int ar[] : a3)
		{
			for(int x : ar)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
 }}