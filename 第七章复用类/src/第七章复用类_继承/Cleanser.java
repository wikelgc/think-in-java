package µÚÆßÕÂ¸´ÓÃÀà_¼Ì³Ğ;

public class Cleanser {
	private String s = "Cleaser";
	
	
	public void append(String a){
		s += a;
	}
	public void dilute(){
		append("ailue()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrup(){
		append("scrub");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.apply();
		x.dilute();
		x.scrup();
	}

}

public class Detergent extends Cleanser{
	//change a method 
	public void scrub(){
		append("Detergent.scrub()");
		super.scrup();  //call base-class version	
	}
	//Add methods to the interface
	public void foam(){
		append("foam()");
	}
	//test new class 
	public static void main(String args[]){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.print(x);
		System.out.print("Testing base class:");
		Cleanser.main(args);	
	}
}