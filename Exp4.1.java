import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add 2. Update 3. Remove 4. Search 5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Salary: ");
                    employees.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    for (Employee e : employees) {
                        if (e.id == id) {
                            System.out.print("Enter new Name and Salary: ");
                            e.name = sc.next();
                            e.salary = sc.nextDouble();
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to remove: ");
                    int removeId = sc.nextInt();
                    employees.removeIf(e -> e.id == removeId);
                    break;
                case 4:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    for (Employee e : employees) {
                        if (e.id == searchId) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 5:
                    sc.close();
                    return;
            }
        }
    }
}

