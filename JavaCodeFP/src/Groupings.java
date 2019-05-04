import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupings {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("George", 25000, "IT"));
		employees.add(new Employee("Nicky", 45000, "Marketing"));
		employees.add(new Employee("Amy", 45000, "HR"));
		employees.add(new Employee("Tom", 90000, "Marketing"));
		employees.add(new Employee("Carla", 90000, "IT"));
		//group by department name
		Map<String, List<Employee>> emps =
				employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentName));
		System.out.println(emps.entrySet());
		//group department + average salary
		Map<String, Double> avg =
				employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentName,
						Collectors.averagingInt(Employee::getSalary)));
		System.out.println(avg.entrySet());
	}

}

class Employee {
	String name;
	int salary;
	String departmentName;
	
	public Employee(String name, int salary, String departmentName) {
		super();
		this.name = name;
		this.salary = salary;
		this.departmentName = departmentName;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	
	@Override
	public String toString() {
		return name;
	}
}