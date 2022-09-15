import java.util.Scanner;

class DrawXYZ {
    public static void main(String[] args) {
        DrawXYZ(3);
    }
    
    private static void DrawXYZ(int n){
        int height = n;
        int pos = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                pos++;
                if (pos%3==0) {
                    System.out.print("X");
                }
                else if (pos%2==0) {
                    System.out.print("Z");
                } 
                else {
                    System.out.print("Y");
                }
                if (j<height-1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}