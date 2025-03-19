class UncheckedException extends RuntimeException
{
	public UncheckedException(String m){
		super(m);
	}
}
class UncheckedDemo2{
	public static void main(String args[]){
		
		int a =15;
		int b = 0;
		try{
			int c = a/b;
		}catch(UncheckedException e){
			System.out.println(e.getMessage());
		}
	}
}