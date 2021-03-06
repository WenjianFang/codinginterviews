
public class Solution {
	public double power(double base, int exponent) {
		if(equal(base, 0.0)) return 0.0;
		
		int unsignExponent = exponent;
		if(exponent < 0) unsignExponent = -unsignExponent;
		
		double result = powerWithUnsignExponent(base, unsignExponent);
		if(exponent<0) result = 1.0/result;
		
		return result;
	}
	private double powerWithUnsignExponent(double base, int unsignExponent){
		
		double result = 1.0;
		for(int i=1; i<=unsignExponent; i++){
			result = result * base;
		}
		return result;
	}
	private boolean equal(double a, double b){
		if((a-b>-0.0000001)&&(a-b<0.0000001)) return true;
		return false;
	}
}
