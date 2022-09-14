public class KonversiNilai {
    public static void main(String[] args){
        int nilai;
        String huruf;

        nilai = 80;
        if(nilai >= 80 && nilai <= 100){
            System.out.print("\n A");
        }
        else if (nilai >= 65 && nilai < 79){
            System.out.print("\n B+");
        }
        else if (nilai >= 50 && nilai < 65){
            System.out.print("\n C");
        }
        else if (nilai >= 35 && nilai < 50){
            System.out.print("\n D");
        }
        else if (nilai <= 34){
            System.out.print("\n E");
        }
    }
}
