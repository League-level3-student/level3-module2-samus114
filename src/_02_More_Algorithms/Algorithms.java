package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int pearlNums = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				pearlNums++;
			}
		}
		return pearlNums;
	}

	public static double findTallest(List<Double> peeps) {
		Double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words) {
		String longestWord = " ";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		for (int j = 0; j < message1.size(); j++) {
			if (message1.get(j).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size() - 1; j++) {
				if (results.get(j) > results.get(j + 1)) {
					double temp = results.get(j);
					results.set(j, results.get(j + 1));
					results.set(j + 1, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size() - 1; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j + 1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j + 1));
					unsortedSequences.set(j + 1, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int j = 0; j < words.size(); j++) {
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i + 1)) > 0) {
					String temp = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, temp);
				}
			}
		}
		return words;
	}
}