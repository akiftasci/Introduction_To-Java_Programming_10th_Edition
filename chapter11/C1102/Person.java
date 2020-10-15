package chapter11.C1102;

import chapter10.C1014.MyDate;



public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Class: Person" + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nPhone No: " + getPhone()
				+ "\nE-mail: " + getEmail();
	}
}

class Student extends Person {
	private static final int FRESHMAN = 1;
	private static final int SOPHOMORE = 2;
	private static final int JUNIOR = 3;
	private static final int SENIOR = 4;
	private int classStatus;

	public Student(String name, String address, String phone, String email, int classStatus) {
		super(name, address, phone, email);
		this.classStatus = classStatus;
	}

	public String getStatus() {
		switch (classStatus) {
		case 1:
			return "freshman";
			
		case 2:
			return "sophomore";
			
		case 3:
			return "junior";
		
		case 4:
			return "senior";
		default:
			return "Unknown";
			}
		}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}

	public String toString() {
		return super.toString() + "\nClass: Student" + "\nStatus: " + getStatus();
	}
}

class Employee extends Person {

	private String office;
	private double salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phoneNumber, String emailAddress, String office,
			double salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired.getYear() + "-" + dateHired.getMonth() + "-" + dateHired.getMonth();
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}

	public String toString() {
		return super.toString() + "\nClass: Employee" + "\nOffice: " + getOffice() + "\nSalary: $" + getSalary()
				+ "\nDate hired: " + getDateHired();
	}
}

class Faculty extends Employee {
	private double officeHours;
	private String rank;

	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			double officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public double getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nClass: Faculty" + "\nOffice hours: " + getOfficeHours() + "\nRank: " + getRank();
	}
}

class Staff extends Employee {
	private String title;

	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			String title) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nClass: Staff" + "\nTitle: " + getTitle();
	}
}

