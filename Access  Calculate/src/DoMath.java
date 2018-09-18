/*This class is client that uses the Calculate Library
 * to perform various mathmatical tasks.
 * @author Leo Liang
 * @Version September 11, 2018
 */
public class DoMath {
	
	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,15));
		System.out.println(Calculate.average(5, 15,30));
		System.out.println(Calculate.toDegrees(1));
		System.out.println(Calculate.discriminant(1, 2, 3));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.max(5, 7));
		System.out.println(Calculate.min(5, 7));
		System.out.println(Calculate.max(5, 10, 8));
		System.out.println(Calculate.absValue(-10));
		System.out.println(Calculate.isDivisibleBy(5, 4));
		System.out.println(Calculate.round2(12.344));
	}

}
