import java.util.Scanner;
public class Warmup1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n Tell me my program is working!\n\n");

        System.out.println("\n Please enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("\n you entered:" + num1);

        System.out.println("\n Please enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("\n you entered:" + num2);

        System.out.println("\n Please enter the third number:");
        int num3 = scanner.nextInt();
        System.out.println("\n you entered:" + num3);

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();

    }

}