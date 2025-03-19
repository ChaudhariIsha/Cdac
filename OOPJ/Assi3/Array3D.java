import java.util.*;
class Array3D{

 public static void main(String args[]){
 
   Scanner scn = new Scanner(System.in);
  int[][][] a = new int[3][3][3];
   int[][][] b = new int [3][3][3];  
  int n = a.length;
  int m = a[0],length;
  int o = a[0][0].length;
  for( int i = 0;i<n;i++){
     for(int j = 0;j<m ;j++){;
	   for(int k=0;k<o ;k++){
	    a[i][j][k]=scn.nextInt();
	   
	   }
	 } 
    }
	
	 for( int i = 0;i<n;i++){
     for(int j = 0;j<m ;j++){;
	   for(k=0;k<o ;k++){
	    b[i][j][k]= a[i]+a[j]+a[k];
	   
	   }
	 } 
    }
 
 
  
 }}