import java.math.BigInteger;

public class FatorialOfLargeNumber {
	
	public static BigInteger findFactorial(int num){
		BigInteger fact = BigInteger.valueOf(1);
		for(int i=1;i<num;i++){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(findFactorial(10000));
	}

}
