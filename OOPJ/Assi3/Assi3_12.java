import java.util.*;
class Assi3_12{
	public static void main(String args[]){
		
		Scanner scn = new Scanner(System.in);
		int [] a= new int[20];
		int even =0;
		int odd =0;
		int mul =0;
		
		
		for(int i = 0 ; i<20 ; i++){
			a[i]=scn.nextInt();
			if(a[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
			if(a[i]%3==0){
				mul ++;
			}
		 }
		 System.out.println("Number of even number: "+even);
		 System.out.println("Number of odd number: "+odd);
		 System.out.println("Number of multiple of 3: "+mul);
		 
}

}