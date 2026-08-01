package classwork;

import java.util.Scanner;

// Marks details class
class MarksData {
    int mark1, mark2, mark3;

    // Constructor
    MarksData(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    int total() {
        return mark1 + mark2 + mark3;
    }

    double average() {
        return total() / 3.0;
    }
}

// Main class
public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        MarksData obj = new MarksData(m1, m2, m3);

        System.out.println("Total = " + obj.total());
        System.out.println("Average = " + obj.average());

        sc.close();
    }
}