package Tugas1OOP;
public class Luas {
        
        // //attribut
        private int sisi;
        private int panjang;
        private int lebar;
        private int alas;
        private int tinggi;

        public int Persegi(int sisi){
            int luasPersegi;
            luasPersegi = sisi*sisi;
            System.out.println(luasPersegi);
            return luasPersegi;
        }

        public int PersegiPanjang(int panjang, int lebar){
            int luasPersegiPanjang;
            luasPersegiPanjang = panjang * lebar;
            System.out.println(luasPersegiPanjang);
            return luasPersegiPanjang;
        }

        public int Segita(int alas, int tinggi){
            int luasSegitiga;
            luasSegitiga = ( alas * tinggi)/2;
            System.out.println(luasSegitiga);
            return luasSegitiga;
        }

}
