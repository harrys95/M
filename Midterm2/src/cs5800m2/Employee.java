package cs5800m2;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Container {
	private String name;
	private String position;
	private int wage;
	private List<Employee>coworkers;
	 
public Employee(String name, String position, int wage) {
		this.name= name;
		this.position= position;
		this.wage= wage;
		coworkers= new ArrayList<Employee>();
}
		 
public void addCoworkers(Employee employee) {
	 coworkers.add(employee);
}
public void removeCoworkers(Employee employee) {
	 coworkers.remove(employee);
}
public List<Employee> getCoworkers() {
	
	return coworkers;
}
public String toString() {
	return"Employee:| Name:"+ name +", Position: "+ position+", Wage: "+wage+"|";
}

@Override
public Iterator<Employee> getIterator() {

	return null;
}

}




