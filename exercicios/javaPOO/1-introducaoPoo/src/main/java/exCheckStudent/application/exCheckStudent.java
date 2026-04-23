package exCheckStudent.application;
import exCheckStudent.entities.CheckStudent;
import java.util.Scanner;

public class exCheckStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckStudent student = new CheckStudent();

        System.out.print("Enter student name: ");
        student.name = scanner.nextLine();
        System.out.print("Enter grade 1: ");
        student.grade1 = scanner.nextDouble();
        System.out.print("Enter grade 2: ");
        student.grade2 = scanner.nextDouble();
        System.out.print("Enter grade 3: ");
        student.grade3 = scanner.nextDouble();

        student.showData();

    }
}
