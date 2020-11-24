import java.util.*;

public class Sort {
	
	public static void populateList(List<Integer> list) {
		final int SIZE	= 5000;
		Random r		= new Random();
		
		for (int i = 0; i < SIZE; i++)
			list.add(r.nextInt(Integer.MAX_VALUE));
	}
	
	public static <E> void insertionSort(List<E> list) {
				
		for (int i = 1; i < list.size(); i++) {
			E value = list.get(i), current;
			int j = i - 1;
			
			while (j >= 0 && ((Comparable)(current = list.get(j))).compareTo(value) > 0) {
				list.set(j + 1, current);
				j--;
			}
			
			list.set(j + 1, value);
		}
	}

	public static void main(String[] args) {
		List<Integer> list	= new MyList<Integer>();
		populateList(list);
		
		long timeSpan = System.currentTimeMillis();
		insertionSort(list);
		timeSpan = System.currentTimeMillis() - timeSpan;
		System.out.println("Insertion sort: " + timeSpan + " ms");
	}

}
