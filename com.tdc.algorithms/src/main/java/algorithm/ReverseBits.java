package algorithm;

public class ReverseBits {

	public ReverseBits() {
		// TODO Auto-generated constructor stub
	}

	public long reverse(long a) {

		if (a == 0l) {
			return 0l;
		}

		String bits = Long.toBinaryString(a);
		int len = bits.length();

		if (len < 32) {
			for (int i = 0; i < 32 - len; i++ ) { 
				bits = "0" + bits;
			}
		}

		System.out.println(bits);

		StringBuilder sb = new StringBuilder();

		for (int i = 32 - 1; i >= 0; --i) {
			sb.append(bits.charAt(i));
		}

		System.out.println(sb);

		long res = 0l;

		for (int i = 0; i < sb.length(); i++) {
			int b = Math.abs(31-i);
			int pow = (int) Math.pow(2, b);
			double val = Math.pow(2, b);
			if (sb.charAt(i) == '1')
				res += val;
		}

		return res;

	}

	public long reverseBitWise(long A) {
		long rev = 0;

		for (int i = 0; i < 32; i++) {
			rev <<= 1;
			System.out.println(A & (1 << i));
			if ((A & (1 << i)) != 0)
				rev |= 1;
		}

		return rev;
	}

	/**
	
	A = 1011
	I = 0
	Rev = 0000
	Rev << = 1 
	0000
	
	1011 & (1 << 0) = 1011 & 0001
	= 0001 (!= 0)
	
	Rev = 0000 | 0001 = 0001

		
	I = 1
	Rev <<=1
	0010
	
	1011 & (1 << 1) = 1011 & 0010
	= 0010 (!= 0)
	
	Rev = 0010 | 0001 = 0011
	
	
	I=2
	Rev <<=1
	0110
	
	1011 & (1 << 2) = 1011 & 0100
	= 0000 (== 0 )!
	
	Rev =0110
	
	
	I = 3
	Rev <<= 1
	1100
	
	1011 & (1 << 3) = 1011 & 1000
	= 1000 (!= 0)
	
	Rev = 1100 | 0001 = 1101
	
	 */

}
