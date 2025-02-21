package firstPackage;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner test = new Scanner(System.in);
        System.out.println("Enter b value");
        String b = test.next();
        if (b.equalsIgnoreCase("None"))
        {
            System.out.println("It is None");
        }
        else {
            System.out.println("It is Not None");
        }
    }
}
