package com.kuliah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int lebarRakSains = 100;
//        int lebarRakSains = 100;
        int lebarRakNovel = 50;
        int totalTebalSains = 0;
        int totalTebalNovel = 0, j = 1;
        int totalAkhirSains = 0;
        int jumlahRak = 0;

        System.out.println("== Program Untuk Menentukan Jumlah Rak Buku ==");

        System.out.print("Masukkan Berapa Buku yang ingin diInput : ");
        int jumlahBuku = scanInput.nextInt();

        String[] namaBuku = new String[jumlahBuku];
        int[] genreBuku = new int[jumlahBuku];
        int[] tebalBuku = new int[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke " + j);
            System.out.print("Masukkan Nama Buku : ");
            namaBuku[i] = scanInput.next();
            System.out.print("Pilih Genre Buku : \n 1. Sains\n 2. Novel\n Pilih Menu : ");
            genreBuku[i] = scanInput.nextInt();
            if (genreBuku[i] == 1){
                genreBuku[i] = 1;
                System.out.println(" Sains");
            }else if (genreBuku[i] == 2){
                genreBuku[i] = 2;
                System.out.println(" Novel");
            }
            System.out.print("Masukkan Tebal Buku : ");
            tebalBuku[i] = scanInput.nextInt();
            j++;
        }

        for (int i = 0; i < jumlahBuku; i++) {
            if (genreBuku[i] == 1) {
                  totalTebalSains += tebalBuku[i];
                  if (totalTebalSains < 50 ){
                      jumlahRak = 1;
                  }else if (totalAkhirSains >= 50){
                      jumlahRak = totalTebalSains / 50;

                  }
            } else if (genreBuku[i] == 2) {
                totalTebalNovel += tebalBuku[i];
                if (totalTebalNovel < 50){
                    jumlahRak = 1;
                }else if (totalTebalNovel >= 50){
                    jumlahRak = totalTebalNovel / 50 ;
                }
            }
        }
        System.out.println("Total Rak yang dibutuhkan : " + jumlahRak);
    }
}
