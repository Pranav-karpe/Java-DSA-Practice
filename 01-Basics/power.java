import java.util.Scanner;

public class power {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean isPower = true;

        if (n <= 0) {
            isPower = false;
        } else {

            while (n % 2 == 0) {
                n = n / 2;
            }

            if (n != 1) {
                isPower = false;
            }
        }

        System.out.println(isPower);

        sc.close();
    }
}