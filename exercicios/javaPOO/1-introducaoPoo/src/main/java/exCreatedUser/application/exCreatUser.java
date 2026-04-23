package exCreatedUser.application;
import exCreatedUser.entities.CreatUser;
import java.util.Scanner;

public class exCreatUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreatUser user = new CreatUser();

        System.out.print("Enter Name: ");
        user.name = scanner.nextLine();
        System.out.print("Enter Gross Salary: ");
        user.grossSalary = scanner.nextDouble();
        System.out.print("Enter Tax: ");
        user.tax = scanner.nextDouble();

        System.out.println(user);

        System.out.print("Wich percentage to increase salary? ");
        user.percentage = scanner.nextDouble();

        System.out.println("Upper Data: " + user);







    }
}
