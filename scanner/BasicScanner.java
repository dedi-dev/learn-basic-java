package scanner;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your name = ");
        String name = scanner.nextLine();
        System.out.print("Inout your age = ");
        int age = scanner.nextInt();

        System.out.println("your name is = " + name + ", and your age is = " + age + " years.");
    }
}
