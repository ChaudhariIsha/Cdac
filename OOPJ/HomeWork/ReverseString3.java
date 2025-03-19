class ReverseString3{
	public static void main(String args[]){
		
		String s = "Chaudhari";
		
       char []arr= s.toCharArray();
	   
	   for(int i=arr.length-1 ;i>=0; i--){
		   System.out.print(arr[i]);
	   }

}}