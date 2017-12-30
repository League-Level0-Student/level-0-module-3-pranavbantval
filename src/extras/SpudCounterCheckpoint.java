package extras;

public class SpudCounterCheckpoint {
	public static void main(String[] args) {
		int n = 0;
		String p = "Potato";
		for (int a = 0; a < 8; a++) {

			n++;
		
		if (n%8==0) {
			System.out.println("more");
		}
		else if(n%4==0) {
			System.out.println(n);
		}
		else  {
			System.out.println(n + " " + p);
		}}
	}}

