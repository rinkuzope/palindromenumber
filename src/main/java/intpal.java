public class intpal {
    public static void main(String[] args) {

        int num = 10101, reverse = 0, temp;
        System.out.println("Given Integer is:" + num);
        int real = num;
        while (num != 0) {
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num /= 10;
        }
        if (real == reverse) {
            System.out.println(real + " is Palindrome.");
        } else {
            System.out.println(real + " is not Palindrome.");
        }
    }
}



