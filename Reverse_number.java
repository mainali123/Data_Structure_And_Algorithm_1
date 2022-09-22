public class Reverse_number {
    public static void main(String[] args) {
        int num = 12345;
        int reverse_num = 0;
        while (num > 0){
            int rem_num = num % 10;
            reverse_num = (reverse_num * 10) + rem_num;
            num /= 10;
        }
        System.out.println(reverse_num);
    }
}