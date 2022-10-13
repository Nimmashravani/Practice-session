package CollectionsDemo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static <Employee> void main(String[] args) {
		ArrayList<Employee>employees = new ArrayList<Employee>();
		Employee employee = new Employee(1, "abc", 90000);
		Employee employee1 = new Employee(2, "xyz", 100000);
		
		Employee temp = null;
		
		AbstractList<E> employees;
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee);
		
		Iterator<Employee>empTraverse = employees.iterator();
		
		System.out.println(employees);
		
		while(empTraverse.hasNext()){
			temp = empTraverse.next();
			
			if(temp.getSalary() == 100000){
				System.out.println("Employee details found, as follows:");
				System.out.println(temp);
			}
		}
		
		int length = employees.size();
		
		for(int i = 0 ; i < length; i++){
			temp = employees.get(i);
			
			if(temp.getSalary() == 100000){
				temp.setSalary(105000);
				employees.set(i, temp);
			}
		}
		
		empTraverse = employees.iterator();
		
		while(empTraverse.hasNext()){
			System.out.println(empTraverse.next());
		}
	
}
}