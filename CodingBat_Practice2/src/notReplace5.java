
public class notReplace5 {
	public static void main(String[] args) {
		String str = "This is isabell";
		String result = "";
		for (int i=0; i<str.length(); ++i) {
			if ((i == 0 || !Character.isLetter(str.charAt(i-1))) && str.substring(i).startsWith("is") && (i+2 >= str.length() || !Character.isLetter(str.charAt(i+2))))
			{
			result = result + "is not";
			i++;
			} else {
				result = result + str.charAt(i);
			}
		}
		System.out.print(str);
	}
}
