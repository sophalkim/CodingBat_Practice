import java.util.Scanner;


public class Decomposition_Math {
	static Scanner sc = new Scanner(System.in);
	static int i;
	public static void main(String[] args) {
		System.out.println("Please enter a number that you want to round.");
		i= sc.nextInt();
		System.out.println("It rounds to " + round(i));
	}
	
	public static int round(int x) {
		if (i%10>=5) {
			return i+(10-(i%10));
		} else {
			return i-(i%10);
		}
	}

}
