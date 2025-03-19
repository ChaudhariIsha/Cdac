import java.util.*;
class Assi3_1{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  
  int a[]=new int[5];
  System.out.println("Enter the element: ");
  
  for(int b=0;b<5;b++){
     a[b]=scn.nextInt();
  }
  
  int smallest=a[0];
  int largest = a[0];
  
  for(int i= 0;i<a.length;i++){
    if(a[i]<smallest){
	 smallest= a[i];
    }
    if(a[i]>largest){
	 largest=a[i];
	}	
  }
  System.out.println("Smallest element in array is: "+smallest);
  System.out.println("Largest element in array is: "+largest);
  
 }
 }