package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program Mencari Nilai Max dan Min Array");

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda : ");
        String nama = scan.nextLine();
        System.out.println("Berapa Nilai yang ingin di Input ? ");
        int x  = scan.nextInt();
        int[] nilai = new int[x];
        int j = 1, total = 0;
        for (int i = 0; i < x; i++){
            System.out.print("Nilai Ke " + j + ": ");
            nilai[i] = scan.nextInt();
            j++;
        }
        System.out.println("Output : ");
        int terkecil = nilai[1];
        int terbesar = nilai[1];
        for (int i = 0; i < x; i++){
            total += nilai[i];
            if (terkecil > nilai[i]){
                terkecil = nilai[i];
            }
            if (terbesar < nilai[i]){
                terbesar = nilai[i];
            }
        }
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Terkecil Yaitu : " + terkecil);
        System.out.println("Nilai Terbesar Yaitu : " + terbesar);
        int rata = total/x;
        System.out.println("Nilai Rata rata : "+ rata);

    }
}
