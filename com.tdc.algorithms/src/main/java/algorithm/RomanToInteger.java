package algorithm;

public class RomanToInteger {

public int romanToInt(String A) {
        
        int result = 0;
        for (int i = 0; i < A.length(); ++i) {
            int s1 = value(A.charAt(i));
            
            if (i + 1 < A.length()) {
                int s2 = value(A.charAt(i+1));
                
                if (s1 >= s2) {
                    result += s1;
                } else {
                    result += s2 - s1;
                    i++;
                }
            } else {
                result += s1;
            }
            
        }
        return result;
    }
    
    public int  value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
      
        return -1; 
    } 
}
