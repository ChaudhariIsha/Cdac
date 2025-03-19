import java.util.*;
class Assi3_14{
  public static void main(String args[]){
	  
	  Scanner scn = new Scanner(System.in);
	  int []a=new int [20];
	  int []e=new int [20];
	  int []o=new int [20];
	  int ei=0;
	  int oi=0;
	  
	  for(int i=0;i<20;i++){
		  a[i]=scn.nextInt();
		  if(a[i]%2==0){
			 e[ei++]=a[i];
		  }
		  else{
			  o[oi++]=a[i];
		  }
		  
	  }
	  for(int x:e){
		  System.out.print(x+" ");
	  }
	  System.out.println();
	   for(int x:o){
		  System.out.print(x+" ");
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
