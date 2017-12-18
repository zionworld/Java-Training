package studentDatabase;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// I am making changes to my code
		
		
		// student one processing
		StudentDatabase s1 = new StudentDatabase("Sreejith", "768489438");
		s1.setCity("Kochi");
		s1.setState("Kerala");
		s1.setPhone("4164599647");
		System.out.println("Enrolled course : " + s1.showCourses("Developer"));
		System.out.println("Address : "+ s1.getCity() + " " + s1.getState() + "  Phone :"+ s1.getPhone());
		s1.depositTuition(10000);
		s1.pay(2340.99);
		System.out.println("Balance is : "+s1.checkBalance());
		System.out.println(s1.toString());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();

		// student two processing
		StudentDatabase s2 = new StudentDatabase("Siva", "649275265");
		s2.setCity("Telangana");
		s2.setState("Telangana");
		s2.setPhone("4164683792");
		System.out.println("Enrolled course : " + s2.showCourses("Tester"));
		System.out.println("Address : "+ s2.getCity() + " " + s2.getState() + "  Phone :"+ s2.getPhone());
		s2.depositTuition(12000);
		s2.pay(5340.43);
		System.out.println("Balance is : "+s2.checkBalance());
		System.out.println(s2.toString());
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		
		// student three processing
		StudentDatabase s3 = new StudentDatabase("Manthan", "628749725");
		s3.setCity("Mumbai");
		s3.setState("Maharashtra");
		s3.setPhone("6470938197");
		System.out.println("Enrolled course : " + s3.showCourses("Team Lead"));
		System.out.println("Address : "+ s3.getCity() + " " + s3.getState() + "  Phone :"+ s3.getPhone());
		s3.depositTuition(15000);
		s3.pay(7350.99);
		System.out.println("Balance is : "+s3.checkBalance());
		System.out.println(s3.toString());
	
	}
}

class StudentDatabase {
	// properties of student database
	private static int ID = 100; // Internal ID
	private String name;
	private String eMail;
	private String SSN;
	private String userID; // ID + random number + SSN 4 digit
	private String phone, city, state;
	private String course;
	private double balance;

	// Constructor
	public StudentDatabase(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		ID++;
		eMail = name + "@sheridancollege.com";
		setuserID();

	}

	// Setting the unique userID
	public void setuserID() {
		enroll();
		System.out.println("New student is enrolled with Student ID : " + userID);
	}

	// Getters and setters for phone, city and state
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// Method to show courses enrolled by each student
	public String showCourses(String course) {
		this.course = course;
		return course;
	}

	// Method to enroll new students
	public void enroll() {
		System.out.println("Enrolling new student");
		int random = (int) 1000 + (int) (Math.random() * ((9000 - 1000) + 1));
		userID = ID + "" + random + SSN.substring(0, 4);

	}

	// Deposit tuition fees
	public void depositTuition(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited : " + balance);
	}

	// Method to pay tuition fees
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Paid the bill : " + amount);
	}

	// Method to check balance
	public double checkBalance() {
		return balance;
	}

	// Method to print student details
	@Override
	public String toString() {
		return "Name : " + name + "\nStudent ID : " + userID + "\nEmail : " + eMail + "\nPhone : " + phone + "\nCity : "
				+ city + "\nstate : " + state + "\nCourse : " + course + "\nBalance : " + balance;
	}

}
