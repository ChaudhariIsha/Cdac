class UncheckedException extends RuntimeException
{
	public UncheckedException(String m){
		super(m);
	}
}
class UncheckedDemo3{
	public static void main(String args[]){
		
		int []a = {1,2,3,4,5};
		try{
			System.out.println(a[5]);
		}catch(UncheckedException e){
			System.out.println(e.getMessage());
		}
	}
}