import java.util.*;
class Assi3_13{
  public static void main(String args[]){
	  
	  Scanner scn = new Scanner(System.in);
	  int [][]mark= new int[20][3];
	  int sum = 0;
	  double aggregate;
	  int ab75=0;
	  int bel40=0;
	  
	  for(int i = 0 ; i<20; i++){
	    for(int j =0; j<3;j++){
			
		  mark[i][j]=scn.nextInt();
		  sum = sum + mark[i][j];
	 }}
	aggregate = (sum /300)*100;
	
	if(aggregate>=75){
		ab75 ++;
	}
	else{
		bel40 ++;
	}
	
	System.out.println("Number of studen above 75 and aggregate: "+ab75);
	System.out.println("Number of studen beloe 40 and aggregate: "+bel40);
	
}
}
