package 第七章复用类_1;

//import static net.mindview.util.print.*;

class Sope{
	private String s;
	Sope() {
		// TODO Auto-generated constructor stub
		System.out.print("Sope()");
		s = "Constructed";
	}
}
public class Bath {
	private String 
	s1 ="happy",
	s2 = "happy",
	s3,s4;
	private Sope castille;
	private int i;
	private float toy;
	public Bath(){   //构造函数
		System.out.print("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Sope();
	}

	//Instance initializatian
	{i = 47;}
	public String toString(){
		if(s4 == null) //Delayed initialization;
			s4 = "Joy";
		return 
				"s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"s3 = " + s3 + "\n" +
				"s4 = " + s4 + "\n" +
				"i = "  + i  + "\n" +
				"toy =" + toy +"\n"+
				"castille = " +castille;
	}
	public static void main(String args[]){
		Bath b = new Bath();
		System.out.print(b);
	}
	
}
