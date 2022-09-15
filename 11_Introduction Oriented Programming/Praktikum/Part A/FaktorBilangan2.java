import java.util.Scanner;
public class FaktorBilangan2 {
    public static void main(String[] args) {
        int bilangan;
        Scanner a = new Scanner(System. in );
        System.out.println("Input: ");
        bilangan = a.nextInt();
        System.out.println("Output:");
        int i = bilangan;
        for (int j = bilangan; j >= 0; j--) {
            i--;
            if (bilangan % i == 0) {
                System.out.print(i + "\n");
            }
        }
    }
}
