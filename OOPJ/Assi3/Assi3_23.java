import java.util.*;
import java.io.*;
class Assi3_23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Enter the no of rows and column: ");
	 int row= sc.nextInt();
	  int col=sc.nextInt();
	 
	 
	 int [][]a=new int[row][col];
	 int max=0;
	 
	 System.out.println("Enter the Array elements: ");
	 for(int i=0;i<row;i++){
		 for(int j =0;j<col;j++){
			 a[i][j]=sc.nextInt();
		 }
	 }
	 
        // Outer loop for rows
        for (int i = 0; i <a.length; ++i) {
 
            // Inner loop for columns
            for (int j = 0; j < a[0].length; ++j) {
 
                // Storing the maximum element
                max = Math.max(a[i][j], max);
            }
		
        }
 
        
        System.out.println("Maximum:  "+max);
		
	}
}
