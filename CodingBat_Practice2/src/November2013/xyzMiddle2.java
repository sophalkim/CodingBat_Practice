package November2013;

public class xyzMiddle2 {

	static String str = "AxyzBBB";
	
	public static boolean xyzMiddle(String str) {
		int len = str.length();
		int middle = str.length() / 2;
		int back = len - middle - 2;
		int front = middle - 1;
		System.out.println("length:" + len + ", middle:" + middle);
		System.out.println(str.substring(middle - 1, middle + 2));
		System.out.println("back:" + back);
		System.out.println("front:" + front);
		if (Math.abs(front - back) <= 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(xyzMiddle(str));
	}
}
