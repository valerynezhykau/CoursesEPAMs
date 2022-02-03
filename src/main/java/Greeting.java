import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello " + vvod.nextLine());
        }
    }
}