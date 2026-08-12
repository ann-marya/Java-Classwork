package tutorial7;
import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    void getDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter RollNo: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    double collegeFee;

    void getCollegeFee(Scanner sc) {
        System.out.print("Enter CollegeFee: ");
        collegeFee = sc.nextDouble();
        sc.nextLine();
    }

    void displayCollegeFee() {
        System.out.println("CollegeFee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    double hostelFee, messFee;

    void getHostellerDetails(Scanner sc) {
        getDetails(sc);
        getCollegeFee(sc);

        System.out.print("Enter HostelFee: ");
        hostelFee = sc.nextDouble();

        System.out.print("Enter MessFee: ");
        messFee = sc.nextDouble();
        sc.nextLine();
    }

    void displayHosteller() {
        System.out.println("\n---HOSTELLER DETAILS---");
        display();
        displayCollegeFee();
        System.out.println("HostelFee: " + hostelFee);
        System.out.println("MessFee: " + messFee);
        System.out.println("TotalFee: " + (collegeFee + hostelFee + messFee));
    }
}

class DayScholar extends StudentAccount {
    double busFee;

    void getDayScholarDetails(Scanner sc) {
        getDetails(sc);
        getCollegeFee(sc);

        System.out.print("Enter BusFee: ");
        busFee = sc.nextDouble();
        sc.nextLine();
    }

    void displayDayScholar() {
        System.out.println("\n---DAY SCHOLAR DETAILS---");
        display();
        displayCollegeFee();
        System.out.println("BusFee: " + busFee);
        System.out.println("TotalFee: " + (collegeFee + busFee));
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hosteller h = new Hosteller();

        System.out.println("Enter Hosteller's Details:");
        h.getHostellerDetails(sc);

        DayScholar d = new DayScholar();

        System.out.println("\nEnter Day Scholar's Details:");
        d.getDayScholarDetails(sc);

        h.displayHosteller();
        d.displayDayScholar();

        sc.close();
    }
}