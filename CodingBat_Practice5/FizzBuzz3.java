public String[] fizzBuzz(int start, int end) {
	int difference = end - start;
	int[] intArray = new int[difference];
	int index = 0;
	for (int i = start; i < end; i++) {
		intArray[index] = i;
		index++;
	}
	String[] stringArray = new String[difference];
	for (int i = 0; i < intArray.length; i++) {
		if (intArray[i] % 3 == 0) {
			stringArray[i] = "Fizz";
		}
		if (intArray[i] % 5 == 0) {
			stringArray[i] = "Buzz";
		}
		if (intArray[i] % 3 == 0 && intArray[i] % 5 == 0) {
			stringArray[i] = "FizzBuzz";
		}
		if (intArray[i] % 3 != 0 && intArray[i] % 5 != 0) {
			stringArray[i] = intArray[i] + "";
		}
	}
	return stringArray;
}