class Light{
 boolean on  ;

  void  switchOn(){
	  on = true;
	  System.out.println("LightBulb is ON");
	  
  }
  void switchOf(){
	  on = false ;
	  System.out.println("LightBulb is OFF");
	  
  }
  void check(){
	 String s = (on == true) ? "LightBulb is ON" : "LightBulb is OFF";
	 System.out.println(s); 
	  }
}
class LightBulb{
	public static void main(String args[]){
		Light l1 = new Light();
		
		l1.switchOn();
		l1.switchOf();
		l1.check();
	
	}
}