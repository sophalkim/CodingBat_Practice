
public class frontBack {
	public static void main(String[] args) {
		String str = "code";
		String x = "";
		int y = str.length();
		String back = str.substring(y-1,y);
		String front = str.substring(0,1);
		
		System.out.print(back + str.substring(1,y-1) + front);
	}
}
