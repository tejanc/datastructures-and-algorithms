package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

import sun.security.util.Debug;


public class MostFrequentWords {

	private boolean debug = false;

	/*
	 * Write an algorithm to find the most frequently used words in the help search box, excluding the commonly used
	 * words in the context of this search, a word is an alphabetic sequence of characters having no whitespace or
	 * punctuation.
	 * 
	 * Input:
	 * The input in the function consists of two arguments-
	 * helpText, a string representing many help searches.
	 * wordsToExclude, a list of strings representing the commonly used words to be excluded while analyzing the word
	 * frequency.
	 *
	 * Output:
	 * Return a list of strings representing the most frequently used word in the help search. In this case of a tie, 
	 * return all of the most frequently used words.
	 *
	 * Note
	 * The words in the search query which differ only by the case are counted as the same word.
	 * The order of words does not matter in the output list.
	 * All words in the wordsToExclude list are unique.
	 * Punctuation should be treated as white space.
	 * Numbers and special characters should be treated as punctuation.
	 *
	 * Example
	 *
	 * Input:
	 * helpText = "Purchase Order Item Help can't find item item is too much part of purchase need fix for image item 
	 * delivered too fast purchase order too big is purchase order coming? Too big why""
	 * wordsToExclude = {"help","fix","too","is","of"}
	 *
	 * Output:
	 * {"item, "purchased"} or {"purchase", "item"}
	 *
	 * Explanation
	 * The word "too" has a maximum of 4 frequency but this word should be excluded while analyzing the word frequency.
	 * The words "purchase" and "item" both have a maximum frequency of 4 and is not predetermined to be excluded from your
	 * analysis. 
	 * So, the output is {"item", "purchase"} or {"purchase", "item"}, the order of the words does not matter.
	 */

	@SuppressWarnings("restriction")
	public List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
		
		List<String> result = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//Removes all punctuation marks
		String helpTextOmmitted = helpText.replaceAll("(?!\")\\p{Punct}", "");
        
		StringTokenizer tokenizer = new StringTokenizer(helpTextOmmitted);

		int max = Integer.MIN_VALUE;
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			
			int flag = 0;
			for (String string : wordsToExclude) {
				flag = token.compareToIgnoreCase(string);
				if (flag == 0)
					break;
			}
			
			if (flag == 0) 
				continue;
			
			if (debug) Debug.println("INFO", token);
			
			if (map.containsKey(token)) {
				map.put(token, map.get(token)+1);
				max = Math.max(max, map.get(token));
			}
			else { 
				map.put(token, 1);
			}
		}
		
		final int absoluteMax = max;
		
		if (debug) Debug.println("INFO", "Max :" + absoluteMax);
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
//		List<Entry<String, Integer>> s1 = set.stream()
//				.filter(entry -> entry.getValue() == absoluteMax)
//				.collect(Collectors.toList());
//		result = s1.stream()
//				.map(entry -> entry.getKey())
//				.collect(Collectors.toList());

		for (Entry<String,Integer> entry : set) { // This is faster
			if (entry.getValue() == max) {
				result.add(entry.getKey());
			}
		}
		
		return result;
	}

}
