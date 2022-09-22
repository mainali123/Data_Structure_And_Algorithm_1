import java.util.Scanner;

public class factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int user_num = sc.nextInt();
        System.out.println("The factors of " + user_num + " are: ");
        for (int i = 1; i <= user_num; i++) {
            if (user_num % i == 0) {
                System.out.println(i);
            }

        }
    }
}
