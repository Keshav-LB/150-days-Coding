package com.leetcode.Strings.hard;

public class CountCompleteSubstrings {
	public static void main(String[] args) {
//		Input: word = "igigee", k = 2
//		Output: 3
//		Explanation: The complete substrings where each character appears
//		exactly twice and the difference between adjacent characters is 
//		at most 2 are: igigee, igigee, igigee.
//		
//		Input: word = "aaabbbccc", k = 3
//		Output: 6
//		Explanation: The complete substrings where each character appears
//		exactly three times and the difference between adjacent
//		characters is at most 2 are: aaabbbccc, aaabbbccc, aaabbbccc,
//		aaabbbccc, aaabbbccc, aaabbbccc.
		
		String word1 = "igigee";
		int k1 = 2;
		String word2 = "aaabbbccc";
		int k2 = 3;
		
		System.out.println(countCompleteSubstrings(word1, k1));
		System.out.println(countCompleteSubstrings(word2, k2));
	}
	public static int countCompleteSubstrings(String word, int k) {
        int n = word.length();
        int totalCount = 0;

        // Step 1: Split into valid segments where diff > 2 breaks
        int start = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n ||(i > 0 && Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2)) {
                if (i > start) {
                    totalCount += countInSegment(word.substring(start, i), k);
                }
                start = i;
            }
        }
        return totalCount;
    }

    private static int countInSegment(String segment, int k) {
        int count = 0;
        int len = segment.length();

        // Try for each possible number of unique chars (1 to 26)
        for (int unique = 1; unique <= 26; unique++) {
            int windowSize = unique * k;
            if (windowSize > len) break;

            int[] freq = new int[26];
            int distinct = 0;
            int matchK = 0; // how many chars have exactly k freq

            // Initialize first window
            for (int i = 0; i < windowSize; i++) {
                int idx = segment.charAt(i) - 'a';
                freq[idx]++;
                if (freq[idx] == 1) distinct++;
                if (freq[idx] == k) matchK++;
                if (freq[idx] == k + 1) matchK--; // crossed k
            }

            if (distinct == unique && matchK == unique) count++;

            // Slide window
            for (int right = windowSize; right < len; right++) {
                int left = right - windowSize;

                // remove left char
                int idxL = segment.charAt(left) - 'a';
                if (freq[idxL] == k) matchK--;
                freq[idxL]--;
                if (freq[idxL] == k) matchK++;
                if (freq[idxL] == 0) distinct--;

                // add right char
                int idxR = segment.charAt(right) - 'a';
                if (freq[idxR] == k) matchK--;
                freq[idxR]++;
                if (freq[idxR] == 1) distinct++;
                if (freq[idxR] == k) matchK++;

                if (distinct == unique && matchK == unique) count++;
            }
        }
        return count;
    }
}
