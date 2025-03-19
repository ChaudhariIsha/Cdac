class UncheckedException extends RuntimeException
{
	public UncheckedException(String m){
		super(m);
	}
}
class UncheckedDemo5{
	public static void main(String args[]){
		
		int age = 18
		try{
			void setAge(int age){
				if(age<0 || age>150){
					throw new UncheckedException 
				}
				
			}
		}catch(UncheckedException e){
			System.out.println(e.getMessage());
		}
	}
}