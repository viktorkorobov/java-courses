package Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Calculator: ");
                int first = scan.nextInt();
                int second = scan.nextInt();
                int sum= first + second;
            System.out.println("Sum: "+sum);
    }
}
