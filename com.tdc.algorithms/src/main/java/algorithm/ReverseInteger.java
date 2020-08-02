package algorithm;

public class ReverseInteger {

	public int reverse(int A) {

		//		int num = A, reversed = 0;
		//		boolean neg = A < 0;
		//
		//        while(num != 0) {
		//            int digit = num % 10;
		//            reversed = reversed * 10 + digit;
		//            num /= 10;
		//        }
		//
		//        if (reversed > Integer.MAX_VALUE) {
		//        	return 0;
		//        }
		//        
		//        System.out.println("Reversed Number: " + reversed);
		//        return neg ? -reversed : (int)reversed;

		boolean neg = A < 0;
		A = Math.abs(A);
		long ret = 0;
		while(A != 0){
			ret = ret*10 + A%10;
			A = A/10;
		}
		//Handles 32 Bit overflow
		if(ret > Integer.MAX_VALUE) return 0;
		return neg ? -(int)ret : (int)ret;

	}
}
