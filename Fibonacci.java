import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner limit = new Scanner(System.in);
        System.out.println("Please enter the limit to generate fibonacci number: ");
        int user_limit = limit.nextInt();

        int first_num = 0;
        int second_num = 1;
        for (int i = 1; i < user_limit; i++) {
            int sum = first_num + second_num;
            if (first_num <= second_num) {
                first_num = sum;
            }
            else if (first_num > second_num) {
                second_num = sum;
            }
        }
        System.out.println(Math.max(first_num, second_num));
    }
}
