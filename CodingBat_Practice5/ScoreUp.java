public int scoreUp(String[] key, String[] answer) {
	int count = 0;
	for (int i = 0; i < key.length; i++) {
		if (answers[i] == "?") continue;
		if (key[i] == answers[i]) count+=4;
		if (key[i] != answers[i]) count--;
	}
	return count;
}