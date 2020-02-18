package com.kuliah;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {


    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);
        String[] genreBook = {"sains", "novel", "comedy", "folk", "fiksi", "religion"};
        ArrayList<Book> rakList = new ArrayList<>();
        Book book = new Book();
        char tambah;
        do {
            System.out.println();
            System.out.print("Judul : ");
            String title = scanInput.next();
            System.out.print("Genre : ");
            String genre = scanInput.next();
            System.out.print("Tebal Buku : ");
            int width = scanInput.nextInt();

            book.setTitleBook(title);
            book.setGenreBook(genre);
            book.setWidthBook(width);
            rakList.add(book);

            if (book.getWidth() > 50) {
                System.out.println("Buku yang anda masukkan harus di potong :V");
                rakList.remove(book);
            }

            System.out.print("Tambah ? [y/n]");
            tambah = scanInput.next().charAt(0);
        } while (tambah == 'y' || tambah == 'Y');

        int[] category = new int[6];
        double[] sumWidth = new double[6];
        double sumRak1 = 0;
        double sumRak2 = 0;
        double sumGenre = 0;

        for (int i = 0; i < rakList.size(); i++) {
            if (rakList.get(i).getGenre().equals(genreBook[0])) {
                category[0] += 1;
                sumWidth[0] += rakList.get(i).getWidth();
                if (sumWidth[0] > 50) {
                    sumRak1 = sumWidth[0] / 50;
                } else {
                    sumRak1 = 1;
                }
            } else if (rakList.get(i).getGenre().equals(genreBook[1])) {
                category[1] += 1;
                sumWidth[1] += rakList.get(i).getWidth();
                if (sumWidth[1] > 50) {
                    sumRak1 = sumWidth[1] / 50;
                } else {
                    sumRak1 = 1;
                }
            } else if (rakList.get(i).getGenre().equals(genreBook[2])) {
                category[2] += 1;
                sumWidth[2] += rakList.get(i).getWidth();
                if (sumWidth[2] > 50) {
                    sumRak1 = sumWidth[2] / 50;
                } else {
                    sumRak1 = 1;
                }
            } else if (rakList.get(i).getGenre().equals(genreBook[3])) {
                category[3] += 1;
                sumWidth[3] += rakList.get(i).getWidth();
                if (sumWidth[3] > 50) {
                    sumRak1 = sumWidth[3] / 50;
                } else {
                    sumRak1 = 1;
                }
            } else if (rakList.get(i).getGenre().equals(genreBook[4])) {
                category[4] += 1;
                sumWidth[4] += rakList.get(i).getWidth();
                if (sumWidth[4] > 50) {
                    sumRak1 = sumWidth[4] / 50;
                } else {
                    sumRak1 = 1;
                }
            } else if (rakList.get(i).getGenre().equals(genreBook[5])) {
                category[5] += 1;
                sumWidth[5] += rakList.get(i).getWidth();
                if (sumWidth[5] > 50) {
                    sumRak1 = sumWidth[5] / 50;
                } else {
                    sumRak1 = 1;
                }
            }
        }

        for (int i : category) {
            sumGenre += i;
        }

        if (sumGenre <= 3) {
            sumRak2 = 1;
        } else if (sumGenre > 3) {
            sumRak2 = sumGenre / 3;
        }

        double sumRak = 0;
        if (sumRak1 > sumRak2) {
            sumRak = sumRak1;
        } else {
            sumRak = sumRak2;
        }

        System.out.println("Rak yang dibutuhkan : " + Math.ceil(sumRak));
    }
}
