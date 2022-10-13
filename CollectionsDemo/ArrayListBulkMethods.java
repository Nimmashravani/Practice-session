package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListBulkMethods {
	public static void main(String[] args) {
		ArrayList<Integer>numbers = new ArrayList<Integer>();
		ArrayList<Integer>naturalNumbers = new ArrayList<Integer>();
		
		numbers.add(99);
		numbers.add(100);
		numbers.add(200);
		numbers.add(100);
		
		naturalNumbers.addAll(numbers);
		naturalNumbers.add(20);
		naturalNumbers.add(30);
		naturalNumbers.add(40);
		
		System.out.println("numbers:");
		System.out.println(numbers);
		
		System.out.println();
		
		System.out.println("natural numbers:");
		System.out.println(naturalNumbers);
		
		naturalNumbers.retainAll(numbers);//retain common elements between
		//naturalNumbers & numbers in naturalNumbers.
		
		boolean isItSame = naturalNumbers.containsAll(numbers);
		
		if(isItSame){
			System.out.println("Are they containing same elements? " + 
		isItSame);
		}
		
		System.out.println();
		System.out.println("natural numbers after retainAll:");
		System.out.println(naturalNumbers);
		
		naturalNumbers.add(20);
		naturalNumbers.add(30);
		naturalNumbers.add(40);
		
		System.out.println();
		System.out.println("natural numbers after adding:");
		System.out.println(naturalNumbers);
		
		isItSame = naturalNumbers.containsAll(numbers);
		
		if(isItSame){
			System.out.println("Are they containing same elements? " + 
		isItSame);
		}
		
		naturalNumbers.removeAll(numbers);//remove common elements between
		//naturalNumbers & numbers, in naturalNumbers
		
		System.out.println();
		System.out.println("natural numbers after removeAll:");
		System.out.println(naturalNumbers);
		
		isItSame = naturalNumbers.containsAll(numbers);
		
		if(isItSame){
			System.out.println("Are they containing same elements? " +
		isItSame);
		}else{
			System.out.println("Now, they are not same.");
		}
	}
}