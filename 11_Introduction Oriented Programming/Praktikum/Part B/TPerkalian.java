public class TPerkalian {
    public static void main(String[] args) {
        CetakTabelPerkalian(5);
    }

    private static void CetakTabelPerkalian(int n) {
        int height = n;
        int[][] array2D = new int[height][height];
        for (int i = 0; i < height; i++) {
            array2D[0][i] = i + 1;
        }
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < height; j++) {
                array2D[i][j] = array2D[0][j] * (i + 1);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(array2D[i][j]);
                if (j < height - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
