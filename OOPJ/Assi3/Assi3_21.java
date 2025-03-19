import java.util.*;
class Assi3_21{
 public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the no of rows and column: ");
	 int row= scn.nextInt();
	  int col=scn.nextInt();
	 
	 
	 int [][]a=new int[row][col];
	 
	 System.out.println("Enter the Array elements: ");
	 for(int i=0;i<row;i++){
		 for(int j =0;j<col;j++){
			 a[i][j]=scn.nextInt();
		 }
	 }
	 
	 for(int i = 0;i<row;i++){
		  int rowsum=0;
		  for(int j = 0;j<col;j++){
			  rowsum += a[i][j];
		  }
		  System.out.println("Sum of " + (i+1) +" row: " + rowsum); 
		  } 
		  
		  
		   for(int j = 0;j<col;j++){
		  int colsum=0;
		  for(int i = 0;i<row;i++){
			  colsum += a[j][i];
		  }
		   System.out.println("Sum of " + (j+1) +" column: " + colsum);
		  }
		
 }

}