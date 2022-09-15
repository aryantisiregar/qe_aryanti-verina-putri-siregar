import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("x: ");

        int A=input.nextInt();

        System.out.print("n:");

        int B=input.nextInt();

        int Hasil=(int) Math.pow(A, B);

        System.out.println("Output:"+Hasil);

    }   

}