import java.util.Scanner;
public class W3Question33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String number = in.next();
        char[] numbers = number.toCharArray();
        int sum =0;
        for (char c : numbers) {
            if (Character.isDigit(c))
                sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(sum);

    }
}
