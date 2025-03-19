class StringDemo1{
	public static void main(String args[]){
		
		String s1 ="Abc"; //String literals
		String s2 ="Abc";
		String s3 ="pqr";
		String s4 ="pqr";
		
		
		//System.out.println(s1 == s1);//true
		//System.out.println(s3 == s4);//true
		//System.out.println(s1 == s3);//false
		
		String s6 = new String("Abc");
		String s7 = new String("Abc");
		//System.out.println(s6 == s7);//false
		//System.out.println(s1 == s6);//false
		
		//System.out.println(s6 == s6);//true
		//System.out.println(s1.equals(s6));//true
		
		System.out.println(s1);
		s1.concat("defg");
		System.out.println(s1);
		
		System.out.println("------------------");
		s1 = s1.concat("def");
		System.out.println(s1);
	}
}