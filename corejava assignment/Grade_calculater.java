import java.util.Scanner;
public class Grade_calculater
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();
        scanner.close();

        displayGrade(marks);
    }

    public static void displayGrade(int marks) {
        char grade;

        if (marks >= 91 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 81 && marks <= 90) {
            grade = 'B';
        } else if (marks >= 71 && marks <= 80) {
            grade = 'C';
        } else if (marks >= 61 && marks <= 70) {
            grade = 'D';
        } else if (marks >= 51 && marks <= 60) {
            grade = 'E';
        } else if (marks >= 41 && marks <= 50) {
            grade = 'F';
        } 
        else{
            grade ='Z';   //fail
        }

        System.out.println("Your grade is: " + grade);
    }
}
