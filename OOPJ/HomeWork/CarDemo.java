class BMW{
	
	void ShowDetails(){
		System.out.println("This is BMW Vehicle.");
	}
	void maxSpeed(){
		System.out.println("Speed varies by model.");
		System.out.println();
	}
	
}
class BMWSeries3 extends BMW{
	
	void ShowDetails(){
		System.out.println("This is BMW Series3 Vehicle.");
	}
	void maxSpeed(){
		System.out.println("Speed of model: 240km/h");
		System.out.println();
	}
}
class BMWSeries5 extends BMW{
	
	void ShowDetails(){
		System.out.println("This is BMW Series5 Vehicle.");
	}
	void maxSpeed(){
		System.out.println("Speed of model: 260km/h");
		System.out.println();
	}
}
class BMWSeries7 extends BMW{
	
	
	void ShowDetails(){
		System.out.println("This is BMW Series7 Vehicle.");
	}
	void maxSpeed(){
		System.out.println("Speed of model: 300km/h");
		System.out.println();
	}
}
class CarDemo{
	public static void main(String args[]){
		BMW[] b = new BMW [4];
		b[0] = new BMW();
		b[1] = new BMWSeries3();
		b[2] = new BMWSeries5();
		b[3] = new BMWSeries7();
		
		
		for(int i=0 ; i<4 ; i++){
			b[i].ShowDetails();
			b[i].maxSpeed();
		}
	}
}