interface Photosynthesis{
    public void absorbSunlight();

	
}
interface Respiration{
	public void releaseOxygen();
	
}
class Plant implements Photosynthesis,Respiration{
	private String PlantName;
	
	Plant(String name){
		this.PlantName = name ;
	}
	
	void GetPlantName(){
		System.out.println("Plant Name: "+PlantName);
		
	}
	
	public void absorbSunlight(){
		System.out.println("Plant is absorbing sunlight for photosynthesis." );
	}
	public void releaseOxygen(){
		System.out.println("Plant is releasing oxygen through respiration.");
	}
}
class PlantDemo{
	public static void main(String args[]){
		Plant p1 = new Plant("Mango Tree");
		Plant p2 = new Plant("Fern");
		
		p1.GetPlantName();
		p1.absorbSunlight();
		p1.releaseOxygen();
		
		System.out.println();
		
		p2.GetPlantName();
		p2.absorbSunlight();
		p2.releaseOxygen();
		
		
	}
}