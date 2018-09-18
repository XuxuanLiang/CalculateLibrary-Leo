/* this class contain method that perform varies math operation
 * @author Leo Liang
 *@version 0.1
 */
public class Calculate {
	//return the square of the input
	public static int square(int num) {
		int answer;
		answer = num*num;
		return answer;
		//return num*num;
	}
	public static int cube(int num) {
		int answer;
		answer = num*num*num;
		return answer;
		//return num*num*num
	}
	public static double average(double num1, double num2) {
		double answer;
		answer = (num1+num2)/2;
		return answer;
	}
	public static double average(double num1, double num2, double num3) {
		double answer;
		answer = (num1+num2+num3)/3;
		return answer;
	}
	public static double toRadians(double deg) {
		double rad;
		rad = deg*3.14159/180;
		return rad;
	}
	public static double toDegrees(double rad) {
		double deg;
		deg = rad/3.14159*180;
		return deg;
	}
	public static double discriminant(double a, double b, double c) {
		double answer;
		answer = b*b-4*a*c;
		return answer;
	}
	public static String toImproperFrac(double num1, double num2, double num3) {
		double numerator;
		double denominator;
		String answer;
		numerator = num1*num3+num2;
		denominator = num3;
		answer = numerator+ "/" +denominator;
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) {
		int num1;
		int num2;
		int num3;
		String answer;
		num1 = numerator/denominator;
		num2 = 1;
		num3 = denominator;
		answer = num1+"_"+num2+"/"+num3;
		return answer;
	}
	public static String foil(int num1, int num2, int num3, int num4, String variable) {
		String answer;
		variable = "n";
		answer = num1*num3+variable+"^2"+"+"+(num1*num4+num2*num3)+variable+"+"+(num2*num4);
		return answer;
	}
	public static double max(double num1, double num2) {
		if(num1>num2)
			return num1;
		else return num2;
	}
	public static double min(double num1, double num2) {
		if(num1<num2)
			return num1;
		else return num2;		
	}
	public static double max(double num1, double num2, double num3) {
		if(num1>num2);
		if(num1>num3) {
			return num1;}
		else if(num2>num3) {
			return num2;}
		else {
			return num3;
		}
		}
	public static double absValue(double num) {
		if(num>0)
			return num;
		else return -num;
	}
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1%num2==0) {
			return true;}
		else {
			return false;}
	}
	public static double round2(double a) {
		a = (a+0.005)*100;
		int b = (int) a;
		double answer = (int) b;
		answer = b*0.01;
		return answer;
	}
}
