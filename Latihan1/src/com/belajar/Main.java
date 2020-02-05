package com.belajar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka[] = new int[5];
        char nilai[] = {'C', 'D', 'B', 'A', 'E'};
        angka[0] = 5;
        angka[1] = 3;
        angka[2] = 7;
        angka[3] = 9;
        angka[4] = 2;
        char nilaiHuruf = 'x';

        char kembali;
        do{
            int terkecil = 0;
            System.out.println("Menu : ");
            System.out.println(" 1. Nilai Angka Terkecil dan Hurufnya ");
            System.out.println(" 2. Tiga Buah Nilai Angka terkecil dan Hurufnya");
            System.out.println(" 3. Segitiga Bintang Sama Sisi");
            System.out.printf("Pilih Menu : ");
            int pilih = scan.nextInt();
            switch(pilih){
                case 1 :
                    System.out.println("====== Menu 1");
                    terkecil = angka[0];
                    for (int i = 0; i<5; i++){
                        if(terkecil>angka[i]){
                            terkecil = angka[i];
                            nilaiHuruf = nilai[i];
                        }
                    }
                    System.out.println("Terkecil : " + terkecil);
                    System.out.println("Nilai Huruf : " + nilaiHuruf);
                    break;
                case 2 :
                    System.out.println("====== Menu 2");
                    terkecil = 10;
                    int j = 0;
                    for (int i = 0; i<5; i++){
                        if(terkecil>angka[i]){
                            if ( j < 3 ){
                                terkecil = angka[i];
                                nilaiHuruf = nilai[i];
                                System.out.println("Terkecil : " + terkecil);
                                System.out.println("Nilai Huruf : " + nilaiHuruf);
                                j++;
                            }
                        }
                    }
                    break;
                case 3 :
                    System.out.println("====== Menu 3");
                    System.out.print("Masukkan Batas : ");
                    int batas = scan.nextInt();
                    for(int i = 0; i < batas; i++){
                        for (int k = 1; k < batas - i; k++){
                            System.out.print(" ");
                        }
                        for (int l = 0; l < i; l++){
                            System.out.print("*");
                        }
                        for (int l = 0; l < i; l++){
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
            }
            System.out.println();
            System.out.print("Kembali Ke Menu ? ");
            kembali = scan.next().charAt(0);
        }while(kembali == 'y' || kembali == 'Y');
    }
}
