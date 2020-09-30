package chapter10.Course;

public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		 Course course2 = new Course("Database Systems");
		
		 course1.ogrenciEkle("Peter Jones");
		 course1.ogrenciEkle("Kim Smith");
		 course1.ogrenciEkle("Anne Kennedy");
		
		 course2.ogrenciEkle("Peter Jones");
		 course2.ogrenciEkle("Steve Smith");
		
		 System.out.println("Number of students in course1: "
		+ course1.getOgrenciSayisi());
		 String[] students = course1.getOgrenciler();
		 for (int i = 0; i < course1.getOgrenciSayisi(); i++)
		 System.out.print(students[i] + ", ");
		
		 System.out.println();
		 System.out.print("Number of students in course2: "
		 + course2.getOgrenciSayisi());
		 }
	}


