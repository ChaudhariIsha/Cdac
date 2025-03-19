class UncheckedException extends RuntimeException
{
	public UncheckedException(String m){
		super(m);
	}
}
class UncheckedDemo1{
	public static void main(String args[]){
		
		String s = null;
		try{
			int a = s.length();
		}catch(UncheckedException e){
			System.out.println(e.getMessage());
		}
	}
}