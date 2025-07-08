package abc_hotel;

public class Util {
	
	public boolean bLog = true;
	
	public void prtln(String str) {
		System.out.println(str);
	}
	
	public void prt(String str) {
		System.out.print(str);
	}
	
	public void prtPageDiv() {
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
	}

	public void prt_log(String str) {
		
		if(bLog == true) {
			System.out.println("------> " + str);
		}
		
	}
	
	
}
