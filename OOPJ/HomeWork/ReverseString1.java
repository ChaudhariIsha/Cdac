class ReverseString1{
	public static void main(String args[]){
		
		String s = "Isha";
		
		byte b[] = s.getBytes();
		byte res[]=new byte[b.length];
		
	for(int i =0;i<b.length;i++){
		    res[i] = b[b.length - i - 1];
	}
	 System.out.println(new String(res));	
	


}}