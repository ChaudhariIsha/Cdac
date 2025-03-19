class Flower{
	String name;
	String colour;
	String fragrence;
	
	
	
}
class Rose extends Flower{
	String throns;
	Rose(String name,String colour,String fragrence,String throns ){
		super.name=name;
		super.colour=colour;
		super.fragrence = fragrence;
		this.throns=throns;
	}
	String hasThrons(){
		if(throns=="Yes"){
		return "Yes";}
		else{
			return"No";
		}
	} 
	void show(){
		System.out.println("-------Rose Details--------");
		System.out.println("Flower Name: "+name);
		System.out.println("Colour: "+colour);
		System.out.println("Has Fragrence: "+fragrence);
		System.out.println("Has Throns: "+hasThrons());
	}
	}
			


class Lily extends Flower{
	String wp;
	
	Lily(String name,String colour,String fragrence,String wp ){
		super.name=name;
		super.colour=colour;
		super.fragrence = fragrence;
		this.wp = wp;
	}
	String isWaterplant(){
		if(wp=="Yes"){
		return "Yes";}
		else{
			return "No";
		}
	}
	void display(){
		System.out.println("-------Lily Details--------");
		System.out.println("Flower Name: "+name);
		System.out.println("Colour: "+colour);
		System.out.println("Has Fragrence: "+fragrence);
		System.out.println("Grows in Water: "+isWaterplant());
	}
	
}
class FlowerDemo{
	public static void main(String args[]){
		Rose f1 = new Rose("Rose","Red","Yes","Yes");
		Lily f2 = new Lily("Lily","White","Yes","Yes");
		f1.show();
		f2.display();
	}
}