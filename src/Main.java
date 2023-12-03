import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();

		student.add(new Student("Gianpaolo", 24));
		student.add(new Student("Francesca", 27));

		System.out.println(student);

		student.add(new Student("Donato", 15));
		student.add(new Student("Paolo", 18));
		student.add(new Student("Antonio", 10));
		student.add(new Student("Giuseppe", 25));

		System.out.println(student);

	}
}