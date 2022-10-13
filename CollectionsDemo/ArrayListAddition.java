package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListAddition {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		int number = 0;
		int sum = 0;
		
		Scanner scInput = new Scanner(System.in);
		
		System.out.print("Enter a number. -999 to stop");
		
		while(true){
			number = Integer.parseInt(scInput.nextLine());
			
			if(number == -999){
				break;
			}
			numbers.add(number);
			
			System.out.print("Enter a number. -999 to stop");
		}
		
		scInput.close();
		
		Iterator<Integer>itrNumbers = numbers.iterator();
		
		while(itrNumbers.hasNext()){
			sum += itrNumbers.next();
		}
		
		System.out.println("The sum: " + sum);
	}
}