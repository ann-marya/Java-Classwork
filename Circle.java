package classwork;

import java.util.Scanner;

// Circle class
class CircleData {
    double radius;

    // Constructor
    CircleData(double r) {
        radius = r;
    }

    // Method to calculate area and circumference
    void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }
}

// Main class
public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        CircleData c = new CircleData(r);
        c.display();

        sc.close();
    }
}