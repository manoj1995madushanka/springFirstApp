package first.firewire.binarySearch;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm=sortAlgorithm;
	}
	// sorting n array
	// searching
	// return result
	public int binrySearch(int[] numbers,int numberToSearchFor) {
		//implement sorting logic
		//search the array
		// BubbleSortAlgorithm bubble = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.print(sortAlgorithm);
		return 3;
	}
}
