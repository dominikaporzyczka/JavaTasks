
public class Main {

	public static void main(String[] args) {
		
		Algorithms algorithms = new Algorithms();
		
		
		int nwd = algorithms.NWD(15, 3);
		int nww = algorithms.NWW(20, 3);
		
		System.out.println("NWD of 15 and 3: " + nwd);
		System.out.println("NWW of 20 and 3: " + nww);
		
		int [] numbers = new int [] {1, 2, 54, 32, 5, -2, 5};
		
		int minEl = algorithms.minElement(numbers);
		
		System.out.println("Min element: " + minEl);
		
		int searchNum = algorithms.searchNumber(numbers, 54);
		
		System.out.println("Index of number 54: " + searchNum);
		
	}

}
