import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char user_choice = input.next().trim().charAt(0);
        int value = (int)(user_choice);

        if (value <= 90 && value >= 65) {
            System.out.println(user_choice + " is a capital letter");
        } else if (value >= 97 && value <= 122) {
            System.out.println(user_choice + " is a small letter");
        }
    }
}
