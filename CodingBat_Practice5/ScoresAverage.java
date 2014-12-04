public int scoresAverage(int[] scores) {
	int middle = scores.length / 2;
	return Math.max(average(scores, 0, middle), average(middle, scores.length));
}

public int average(int[] scores, int start, int end) {
	int sum = 0;
	for (int i = start; i < end; i++) {
		sum += scores[i];
	}
	int average = (sum / (end - start));
	return average;
}