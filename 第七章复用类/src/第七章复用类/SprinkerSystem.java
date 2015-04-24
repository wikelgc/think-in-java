package µÚÆßÕÂ¸´ÓÃÀà;	
public class  SprinkerSystem{
	private String valve1,valve2,valve3;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString(){
		return 
				"value1 = "+ "value1"+" "+
				"value2 = "+"value2"+" "+
				"value3 = "+ "value3"+""+
				"i = " + i+ " " + "f="+f+""+
				"source =" + source; 
	}

	public static void main(String[] args){
		SprinkerSystem sprinlers = new SprinkerSystem();
	System.out.println(sprinlers);
	}
}



