package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();//default capacity: 10
		
		//numbers.add("welcome");
		//Above lines are not recommended approach.
		numbers.add(99);
		numbers.add(100);
		numbers.add(200);
		numbers.add(100);
		
		System.out.println(numbers);
		
		numbers.remove(3);
		
		int size = numbers.size();
		
		System.out.println("Using simple for loop:");
		for(int i = 0 ; i < size ; i++){
			System.out.println(numbers.get(i));
		}
	}
}