import java.util.Scanner;

public class javaswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("Number is negative");
        }
        System.out.print("Day of the Week: ");
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
        System.out.print("First " + a + " Even Numbers: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(i * 2 + " ");
        }
        System.out.println();
        int temp = a;
        long factorial = 1;
        while (temp > 1) {
            factorial *= temp;
            temp--;
        }
        System.out.println("Factorial of " + a + " = " + factorial);

        sc.close();
    }
}
























































































































































































































































































































































































































































































































































    





