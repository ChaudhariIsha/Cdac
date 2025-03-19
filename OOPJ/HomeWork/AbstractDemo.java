abstract class Vehicle{
	abstract void specification();
}
class Bike extends Vehicle{
	void specification(){
		System.out.println("Speed of bike is:115km/hr");
	}
		static void average(){
			System.out.println("average of bike is:45kmper litre");
		}
	
}
class AbstrctDemo{
public static void main(String args[]){
	
	Vehicle v = new Bike();
	v.specification();
	Bike.average();
	
	
}
}