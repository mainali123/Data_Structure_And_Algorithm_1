import java.util.Scanner;

public class factorial_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int user_choice = sc.nextInt();
        int mul = 1;
        for (int i = user_choice; i != 0; i--) {
            mul = mul * i;
        }
        System.out.println(user_choice + "! = " + mul);
    }
}
