
public class In1to10 {

	public static boolean in1to10(int n, boolean outsideMode) {
		if (outsideMode) {
			if (n <= 1 || n >= 10) {
				return true;
			}
		}
		if (!outsideMode && n >= 1 && n <= 10) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int n = 11;
		boolean outsideMode = false;
		System.out.println(in1to10(n, outsideMode));
	}
}
