import java.util.*;
class ArrayTran{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  
   int arr[][] = new int[2][2];
   int tr[][] = new int [2][2];
   
    for(int i=0;i<2;i++){
    for(int j =0;j<2;j++){
	System.out.println("Enter the element");
	   arr[i][j]=scn.nextInt();
	}}
	for(int a[] :arr)
	{
	  for(int x :a){
	  System.out.print(" "+x);
	  }
	   System.out.println();
	}
	
    for(int i=0;i<2;i++){
    for(int j =0;j<2;j++){
	
	   tr[j][i] = arr[i][j];
	}
	
	}
	System.out.println("Transpose of Matrix:");
	for(int a[] :tr)
	{
	  for(int x :a){
	  System.out.print(" "+x);
	  }
	   System.out.println();
	}
}}