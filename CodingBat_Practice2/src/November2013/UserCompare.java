package November2013;

public class UserCompare {

	public static int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) == 0) {
			if (aId == bId) {
				return 0;
			}
			if (aId > bId) {
				return 1;
			} else {
				return -1;
			}
		}
		if (aName.compareTo(bName) < 0) {
			return -1;
		}
		if (aName.compareTo(bName) > 0) {
			return 1;
		}
		  return 0;
		}
	
	
	public static void main(String[] args) {
		
		String aName = "bb";
		int aId = 1;
		String bName = "bb";
		int bId = 1;
		System.out.println(userCompare(aName, aId, bName, bId));
	}
}
