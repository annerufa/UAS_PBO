/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Soal1;

/**
 *
 * @author Kelompok 1
 * Teknik Informatka - Univ.Islam Balitar
 */
public class Main implements PajakInterface {
    
    String vendor, tipe;
    int harga;

    public Main(String vendor, String tipe, int harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;

        hargaSetelahPajak();
    }

    @Override
    public double hargaSetelahPajak() {
        if (harga > 4500000) {
            return (harga + (harga * PAJAK5));
        } else if(harga > 4200000){
            return (harga + (harga * PAJAK2));
        } else if (harga > 4000000){
            return (harga + (harga * PAJAK1));
        } else{
            return harga;
        }
    }

    public static void main(String[] args) {

        //array of object
        Main[] obj = new Main[3];
        obj[0] = new Main("Samsung", "A 51", 5000000);
        obj[1] = new Main("Oppo", "Reno 5", 4400000);
        obj[2] = new Main("Xiaomi", "A1", 4100000);

        System.out.println("###########-PROGRAM HITUNG HARGA SETELAH PAJAK-##############\n");
        System.out.println("--------------|--------------|--------------|-----------------");
        System.out.println("VENDOR\t\tTIPE\t\tHARGA\t\tHARGA+PPN");
        System.out.println("--------------|--------------|--------------|-----------------");
        for (Main brg : obj) {
            System.out.println(brg.vendor + "\t\t" + brg.tipe + "\t\t" + brg.harga + "\t\t" + brg.hargaSetelahPajak()+"\n");
        }
    }
}
