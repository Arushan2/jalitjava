import java.util.Scanner;
public class MainEmployee{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the ID");
        int id = scan.nextInt();
        System.out.println("Please enter the Name");
        String name = scan.next();
        System.out.println("Please enter the Salary");
        double salary = scan.nextDouble();
        Employee employee1 = new Employee(id,name);
		employee1.setBasicSalary(salary);
		employee1.display();
    }
}