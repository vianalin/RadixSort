public class Radix {

	//1: get nth digit of an int, where 0 is the ones column, 1 is the tens column etc.
	//123: 2 = hundreds, 1 = tens, 0 = ones
	public static int nth(int n, int col) {
		int divisor = (int) Math.pow(10, col);
		return Math.abs(((int) n / divisor) % 10);
	}

	//2: get the number of digits in n
	public static int length(int n) {
		return String.valueOf(Math.abs(n)).length(); //turn abs n to string n count
	}


	//public static void merge(MyLinkedList original, MyLinkedList[] buckets);
}