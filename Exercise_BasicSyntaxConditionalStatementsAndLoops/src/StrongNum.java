import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int allDigits = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = num % 10;
            num /= 10;
            int fact = 1;

            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            allDigits += fact;
        }
        if (number == allDigits){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
