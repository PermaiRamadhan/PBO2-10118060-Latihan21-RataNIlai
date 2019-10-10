/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg21.rata.nilai;

import java.util.Scanner;
import java.util.stream.IntStream;
/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 * Deskripsi Program    : program Menghiting nilai rata rata mahasiswa
 */
public class PBO210118060LatihanKe21RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        Scanner banyak = new Scanner(System.in);
        int j = banyak.nextInt();
        int[] nilai= new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" :");
            Scanner N = new Scanner(System.in);
            nilai[i]=N.nextInt();
        }
        double sum = IntStream.of(nilai).sum();
        double avg = sum/j;
        System.out.println("Maka, Rata-rata Nilainya adalah "+avg);
        System.out.println("Developed By : Permai Ramadhan");
    }
    
}
