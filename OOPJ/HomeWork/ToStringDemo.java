class ToStringDemo{
	String name;
	int id ;
	
	ToStringDemo(String name,int id){
		this.name = name;
		this.id = id;
		
	}
	@Override
	public String toString(){
		return name+" "+id;
	}
	
	public static void main(String args[]){
		ToStringDemo t1 = new ToStringDemo("abc",111);
		System.out.println(t1);
	}
}