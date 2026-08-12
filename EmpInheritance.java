package tutorial7;
import java.util.Scanner;

class Employee {
    String name, address;
    int age, mob;
    float sal;

    void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Mobile: " + mob);
    }

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String specialization;

    void print_Specialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    void print_Dept() {
        System.out.println("Department: " + department);
    }
}

public class EmpInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Officer details
        Officer off = new Officer();

        System.out.println("Enter Officer's Name:");
        off.name = sc.nextLine();

        System.out.println("Enter Address:");
        off.address = sc.nextLine();

        System.out.println("Enter Age:");
        off.age = sc.nextInt();

        System.out.println("Enter Mobile:");
        off.mob = sc.nextInt();

        System.out.println("Enter Salary:");
        off.sal = sc.nextFloat();

        sc.nextLine();

        System.out.println("Enter Specialization:");
        off.specialization = sc.nextLine();

        // Manager details
        Manager man = new Manager();

        System.out.println("Enter Manager's Name:");
        man.name = sc.nextLine();

        System.out.println("Enter Address:");
        man.address = sc.nextLine();

        System.out.println("Enter Age:");
        man.age = sc.nextInt();

        System.out.println("Enter Mobile:");
        man.mob = sc.nextInt();

        System.out.println("Enter Salary:");
        man.sal = sc.nextFloat();

        sc.nextLine();

        System.out.println("Enter Department:");
        man.department = sc.nextLine();

        // Display Officer details
        System.out.println("\n--- Officer Details ---");
        off.printEmployee();
        off.print_Salary();
        off.print_Specialization();

        // Display Manager details
        System.out.println("\n--- Manager Details ---");
        man.printEmployee();
        man.print_Salary();
        man.print_Dept();

        sc.close();
    }
}