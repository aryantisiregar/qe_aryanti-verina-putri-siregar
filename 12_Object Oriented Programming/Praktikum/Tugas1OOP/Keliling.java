package Tugas1OOP;
public class Keliling {
    

    public int Persegi(int sisi){
        int kelilingPersegi;
        kelilingPersegi = 4*sisi;
        System.out.println(kelilingPersegi);
        return kelilingPersegi;
    }

    public int PersegiPanjang(int panjang, int lebar){
        int kelilingPersegiPanjang;
        kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println(kelilingPersegiPanjang);
        return kelilingPersegiPanjang;
    }

    static double pitagoras(double alas, double tinggi){
        double c = Math.sqrt( Math.pow(alas,2) + Math.pow(tinggi,2) );
        return c;
    }

    public double Segita(double alas, double tinggi){
        double kelilingSegitiga;
        kelilingSegitiga = alas + tinggi + pitagoras(alas, tinggi);
        System.out.println(kelilingSegitiga);
        return kelilingSegitiga;
    }
}
