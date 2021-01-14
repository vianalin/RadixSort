public class Tester {
	public static void main(String[] args) {

		//planning out how to do nth:
		//nth(123, 1) = 2
		//10 = Math.pow(10, 1);
		//System.out.println(((int) 123 / 10) % 10);

		System.out.println("testing nth: ");
		System.out.println(Radix.nth(123,1) == 2);

	}
}