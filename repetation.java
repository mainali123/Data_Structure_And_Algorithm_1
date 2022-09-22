import java.util.Scanner;

public class repetation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int user_input = sc.nextInt();
        System.out.println("Please enter which integer you want to find the repetition of: ");
        int repetition_num = sc.nextInt();

        int number = user_input;
        int count = 0;

        while(number > 1){
            if((number % 10) == repetition_num){
                count++;
                number = number / 10;
            }
            else{
                number = number / 10;
            }
        }
        System.out.println(user_input + " is repeated " + count + " times.");
    }
}
