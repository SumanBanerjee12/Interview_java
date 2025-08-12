package practies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;




public class SortExample {
	
	public static void main(String[] args) {
		  List<Person> people = Arrays.asList(
		            new Person("Mobile", "123"),
		            new Person("Land", "345"));
	

	
	
	 List<Person> sorted = people.stream()
             .sorted(Comparator.comparing(Person::getType)
                     .thenComparing(Comparator.comparing(Person::getId).reversed()))
             .collect(Collectors.toList());
	 
     sorted.forEach(System.out::println);
}

}



class Person{
	private String type;
	private String id;

	public Person(String type, String id) {
		super();
		this.type = type;
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Persion [type=" + type + ", id=" + id + "]";
	}	
}
