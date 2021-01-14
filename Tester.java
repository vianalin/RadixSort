public class Tester {
	public static void main(String[] args) {

		//planning out how to do nth:
		//nth(123, 1) = 2
		//10 = Math.pow(10, 1);
		//System.out.println(((int) 123 / 10) % 10);

		System.out.println("testing nth: ");
		System.out.println(Radix.nth(123,1) == 2);
		System.out.println(Radix.nth(-123,1) == 2);
		System.out.println(Radix.nth(123,2) == 1);
		System.out.println(Radix.nth(-123,2) == 1);

		System.out.println("testing length: ");
		System.out.println(Radix.length(0) == 1);
		System.out.println(Radix.length(15) == 2);
		System.out.println(Radix.length(-10) == 2);
		System.out.println(Radix.length(5112) == 4);

	}
}