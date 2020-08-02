package algorithm;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class FirstNonRepeatingChar {
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();

//	public String solve(String A) {
//		
//		if (A.length() == 0) return null;
//		
//		StringBuilder sb = new StringBuilder();
//		char[] a = A.toLowerCase().toCharArray();
//		char currNonRepeating;
//		// count and insert into hash map.
//		for (int i = 0; i < a.length; ++i) {
//			if (map.containsKey(a[i])) {
//				map.put(a[i], map.get(a[i]) + 1);
//			} else {
//				currNonRepeating = a[i];
//				map.put(a[i], 0);
//				sb.append(a[i]);
//			}
//		}
//		
//		return sb.toString();
//	}
	public String solve(String s) {
		int cnt[] = new int[26];
        Queue <Character> q = new ArrayDeque();
        int n = s.length();
        char ans[] = new char[n];
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            cnt[c - 'a']++;
            if(cnt[c - 'a'] == 1)   q.add(c);
            while(!q.isEmpty() && cnt[q.peek() - 'a'] > 1)  q.poll();
            if(q.isEmpty()) ans[i] = '#';
            else    ans[i] = q.peek();
        }
        return new String(ans);
	}
	
}
