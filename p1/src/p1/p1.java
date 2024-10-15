package p1;
class Student_Details {
    String usn;
    String name;
    String branch;
    String phone;

    // Method to set student details
    void setDetails(String student_usn, String name, String branch, String phone) {
        this.usn = student_usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    // Method to display student details
    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println(); // Empty line for better formatting
    }
}

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Create an array to store 'n' Student objects
        int n = 3; // Number of students
        Student_Details[] students = new Student_Details[n];

        // Initialize each Student object
        for (int i = 0; i < n; i++) {
            students[i] = new Student_Details();
        }

        // Set student details
        students[0].setDetails("121", "John", "CSE", "1234567890");
        students[1].setDetails("122", "Smith", "EE", "9876543210");
        students[2].setDetails("123", "Bob", "ME", "1112223333");

        // Display student details with headings
        System.out.println("Student Details:");
        System.out.println("-----------------");
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Student " + (i + 1) + ":");
            students[i].display();
        }
    }
}
