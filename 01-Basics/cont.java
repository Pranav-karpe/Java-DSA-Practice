import java.util.Scanner;

public class cont {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num;
        int count = 0;

        while (num != 0) {

            int digit = num % 10;

            if (digit != 0 && original % digit == 0) {
                count++;
            }

            num /= 10;
        }

        System.out.println("Count = " + count);

        sc.close();
    }
}