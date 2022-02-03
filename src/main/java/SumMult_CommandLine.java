import java.util.Scanner;

public class SumMult_CommandLine {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = vvod.nextInt();
            int y = vvod.nextInt();

            System.out.println("Sum= " + (x + y));
            System.out.println("Mutli= " + (x * y));
        }
    }
}



