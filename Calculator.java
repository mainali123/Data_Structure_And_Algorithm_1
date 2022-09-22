import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter the operation you want to perform: ");
            char operator = sc.next().trim().charAt(0);
            if (operator == 'x' || operator == 'X'){
                break;
            }

            System.out.println("Enter the first number: ");
            double first_num = sc.nextDouble();
            System.out.println("Enter the second number: ");
            double second_num = sc.nextDouble();
            double final_answer = 0;
            if (operator == '+'){
                final_answer = first_num + second_num;
            } else if (operator == '-') {
                final_answer = first_num - second_num;
            } else if (operator == '*') {
                final_answer = first_num * second_num;
            } else if (operator == '/') {
                final_answer = first_num / second_num;
            }
            System.out.println(first_num +""+ operator +""+ second_num + " = " + final_answer);
        }
    }
}
