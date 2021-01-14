import java.util.*;
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

	//3: merge all of the linked lists in the bucket array into ur original linked list
	//   original may have elements and those should be kept
	//   this is 0(buckets.length) which shld be 10 when we use later
	//   the bucket[0] will be merged first, then the bucket[1]
	public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {
		for(int i = 0; i < buckets.length; i++) {
			original.extend(buckets[i]);
		}
	}

	public static void radixSortSimple(SortableLinkedList data) {
		SortableLinkedList[] buckets = new SortableLinkedList[10];
		for(int i = 0; i < 10; i++) { //making list w all 10 places
			buckets[i] = new SortableLinkedList();
		}

		int max = 0;
		int place = 0;
		while(data.size() != 0) {
			int value = data.get(0);
			if(length(value) > max) max = length(value);
			place = nth(value, 0);
			buckets[place].add(value);
			data.remove(0);
		}
		merge(data, buckets);

		for(int i = 1; i < max; i++) {
			buckets = new SortableLinkedList[10];
			for(int j = 0; j < 10; j++) {
				buckets[j] = new SortableLinkedList();
			}
			while(data.size() != 0) {
				int value = data.get(0);
				place = nth(value, i);
				buckets[place].add(value);
				data.remove(0);
			}
			merge(data, buckets);
		}

	}

}