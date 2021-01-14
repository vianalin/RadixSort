public class Radix {

	//1: get nth digit of an int, where 0 is the ones column, 1 is the tens column etc.
	//123: 2 = hundreds, 1 = tens, 0 = ones
	public static int nth(int n, int col) {
		int divisor = (int) Math.pow(10, col);
		return ((int) n / divisor) % 10;
	}



	//public static int length(int n);

	//public static void merge(MyLinkedList original, MyLinkedList[] buckets);
}