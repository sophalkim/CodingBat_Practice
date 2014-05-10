
public class Basal_MetaBolic_Rate {

	static int age = 29;
	static int gender = 2; // male
	static int height = 62; //position
	static int weight = 140; // lbs
	static int exercise = 3; //position
	
	static int x = 0;
	static int weightx = 0;
	static int heightx = 0;
	static int agex = 0;
	static int exericsex = 0;
	
	public static void main(String[] args) {
		if (gender == 1) {
			x = 66;
			weightx = (int) ((weight/2.2)*13.7);
			heightx = (int) (height*2.54)*5;
			agex = (int) (age*6.8);
		} else {
			x = 655;
			weightx = (int) ((weight/2.2)*9.6);
			heightx = (int) ((height*2.54)*1.8);
			agex = (int) (age*4.7);
		}
		System.out.println("Your Basal MetaBolic Rate is "+(x+weightx+heightx-agex));
	}
	
	
	
	
}
