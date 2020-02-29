public class ArrayOperations {
	private int[] numbers;
	private int[] unsorted;

	public ArrayOperations(int[] numbers) {
		this.numbers = numbers;
		this.unsorted = numbers.clone();
	}

	public void printSorted() {
		for (int i : getSorted()) {
			System.out.print(i + " ");
		}
	}

	public int[] getSorted() {
		sort();
		return numbers;
	}

	public void printUnsorted() {
		for (int i : getUnsorted()) {
			System.out.print(i + " ");
		}

	}

	public int[] getUnsorted() {
		return unsorted;
	}

	public boolean contains(int value) {
		for (int item : numbers) {
			if (item == value) {
				return true;
			}
		}
		return false;
	}

	/*
	 * private methods
	 */

	private int[] sort() {
		/*
		 * bubble sort
		 */
		int n = numbers.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}

		return numbers;
	}
}
