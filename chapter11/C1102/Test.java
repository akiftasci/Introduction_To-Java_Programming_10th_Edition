package chapter11.C1102;

public class Test {

		public static void main(String[] args) {
			Person p = new Person("person", "personAddress", "1241521", "personEmail");
			Student s = new Student("studentName", "studentAddress", "1111111", "studentEmail", 2);
			Employee e = new Employee("employeeName", "employeeAddress", "22222", "employeeEmail", "office", 20000);
			Faculty f = new Faculty("facultyName", "facultyAddress", "333333", "facultyEmail", "facultyOffice", 50000, 12, "facultyRank");
			Staff s1 = new Staff("staffName", "staffAddress", "55555555", "staffEmail", "staffOffice", 5000, "staffRank");

			System.out.println(p.toString());
			System.out.println();
			System.out.println(s.toString());
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println(f.toString());
			System.out.println();
			System.out.println(s1.toString());

		}
}
