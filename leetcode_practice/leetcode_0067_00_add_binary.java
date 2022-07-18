//https://leetcode.com/problems/add-binary/

import java.math.BigInteger;
public class leetcode_0067_00_add_binary {

	public String addBinary(String a, String b) {
		BigInteger aInDecimal = new BigInteger(a, 2);
		BigInteger bInDecimal = new BigInteger(b, 2);
		BigInteger sumInDecimal = aInDecimal.add(bInDecimal);
		return sumInDecimal.toString(2);
	}

}
