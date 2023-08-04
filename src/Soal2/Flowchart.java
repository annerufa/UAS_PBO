/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal2;

import java.util.Scanner;

/**
 *
 * @author Kelompok 1
 * Teknik Informatka - Univ.Islam Balitar
 */
public class Flowchart {
     public static void main(String[] args) {
        //deklarasi dan inisialisasi variabel
        int a = 100;
        int b = 25;
        int hasil = 0;

        //output tampilkan menu pilihan
        System.out.println("Menu Pilihan: \n1. Penjumlahan \n2. Pengurangan");
        System.out.print("Masukkan Pilihan:");
        
        //input pilihan
        // membuat object scanner untuk menerima input dari user 
        Scanner inputan = new Scanner(System.in);
        // deklarasi variabel pilihan bertipe int untuk menyimpan input bertipe integer
        int pilihan = inputan.nextInt();  
        
        //switch case pilihan (merupakan statement untuk mengecek kondisi dan melakukan sesuatu berdasarkan kondisi tsb)
        switch(pilihan) { 
            
            case 1: 
            // jika pilihan = 1 
                hasil = a+b;
                //tampilkan hasil
                System.out.println("\nHasil perhitungan "+a+ " + "+ b+" = "+hasil);
                break;
            case 2: 
            // jika pilihan = 2
                hasil = a-b;
                //tampilkan hasil
                System.out.println("\nHasil perhitungan "+a+ " - "+ b+" = "+hasil);
                break; 
            default: 
            //jika pilihan bukan 1 dan bukan 2
                System.out.println("Pilihan anda salah");
                break;
        }
        
        //selesai
    }
}
