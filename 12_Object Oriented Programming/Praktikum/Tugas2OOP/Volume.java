package Tugas2OOP;
public class Volume {
        public int Kubus(int sisi){
            int volumeKubus;
            volumeKubus = sisi*sisi*sisi;
            System.out.println(volumeKubus);
            return volumeKubus;
        }

        public int Balok(int panjang, int lebar, int tinggi){
            int volumeBalok;
            volumeBalok = panjang * lebar * tinggi;
            System.out.println(volumeBalok);
            return volumeBalok;
        }

        public double Tabung(double jari, double tinggi){
            double phi;
            if (jari % 7 == 0) {
                phi=22/7;
            }else{
                phi=3.14;
            }
            double volumeBalok;
            volumeBalok = phi * (jari*jari) * tinggi;
            System.out.println(volumeBalok);
            return volumeBalok;
        }

}
