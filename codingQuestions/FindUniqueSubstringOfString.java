package codingQuestions;

/**
 * Given string ‘s’, the task is to divide a given string s into multiple substrings, with each substring containing only unique characters. This means that no character should be repeated within a single substring. The goal is to find the minimum number of such substrings required to satisfy this condition.

Examples:

Input: s = “abacaba”
Output: 4
Explanation: Two possible partitions are (“a”, “ba”, “cab”, “a”) and (“ab”, “a”, “ca”, “ba”). It can be shown that 4 is the minimum number of substrings needed.

Input: s = “ssssss”
Output: 6
Explanation: The only valid partition is (“s”, “s”, “s”, “s”, “s”, “s”).
 * **/



public class FindUniqueSubstringOfString {

	public static void main(String[] args) {

		String input = "abacaba";

		int subStringCount = 0;
		int first = 0;
		int last = 1;

		while (last <= input.length()) {
			if (hasUniqueElements(input.substring(first, last))) {
				if (last == input.length()) {
					subStringCount++;
				}
				last++;
			} else {
				subStringCount++;
				first = last - 1;
				last = first + 1;
			}
		}

		System.out.println(subStringCount);
	}

	static boolean hasUniqueElements(String input) {

		int i = 0, j = 0;
		for (char c1 : input.toCharArray()) {
			for (char c2 : input.toCharArray()) {
				if (i == j)
					continue;
				if (c1 == c2)
					return false;
				j++;
			}
			i++;
		}
		return true;
	}
}
