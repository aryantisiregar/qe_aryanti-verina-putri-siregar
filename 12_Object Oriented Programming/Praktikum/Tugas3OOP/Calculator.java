package Tugas3OOP;

public class Calculator {
    
    //method
    //Penjumlahan
    public int Penjumlahan(int a, int b){
        int hasil = a + b;
        return hasil;
    }

    //Pengurangan
    public int Pengurangan(int a, int b){
        int hasil = a - b;
        return hasil;
    }

    //Perkalian
    public int Perkalian(int a, int b){
        int hasil = a * b;
        return hasil;
    }

    //Pembagian
    public int Pembagian(int a, int b){
        int hasil = a / b;
        return hasil;
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        System.out.println(cal1.Penjumlahan(3, 4));
        System.out.println(cal1.Pengurangan(15, 4));
        System.out.println(cal1.Perkalian(10, 10));
        System.out.println(cal1.Pembagian(12, 3));

    }
}
