package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListContains {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		int number = 0;
		int noToBeFound = 0;
		
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
		
		System.out.print("Enter a quantity: ");
		noToBeFound = Integer.parseInt(scInput.nextLine());
		
		if(numbers.contains(noToBeFound)){
			System.out.println("Given number is present.");
		}else{
			System.out.println("Given number is not present.");
		}
		
		scInput.close();
	}
}