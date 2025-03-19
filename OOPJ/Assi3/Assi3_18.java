import java.util.*;
class Assi3_18{
 public static void main(String args[]){
     
	 Scanner scn = new Scanner(System.in);
	 int m = scn.nextInt();
	 int n = scn.nextInt();
	 
	 int [][]a = new int[m][n];
	 
	 System.out.println("Enter element:");
	 for(int i =0; i<m ; i++){
		 for(int j =0 ;j<n ;j++){
			 a[i][j] = scn.nextInt();
		 }
	 }
	 for( int ar[]: a){
		 for(int x : ar){
		 System.out.print(x+" ");
	 }
	 System.out.println();}
 
 }}