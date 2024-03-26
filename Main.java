package org.example;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String nama, tanggalLahir;
        char JenisKelamin;

        System.out.print("Masukkan Nama anda: ");
        nama = scan.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        JenisKelamin = scan.nextLine().charAt(0);
        System.out.print("Tanggal Lahir: ");
        tanggalLahir = scan.nextLine();

        //Parsing tanggal lahir menjadi objek local datemain
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate born = LocalDate.parse(tanggalLahir, formatter);

        // Menghitung umur berdasarkan tanggal lahir
        LocalDate tanggalSekarang = LocalDate.now();
        int tahun = Period.between(born, tanggalSekarang).getYears();
        int bulan = Period.between(born, tanggalSekarang).getMonths();


        System.out.println("\n");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (JenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Umur: " + tahun + " tahun " + bulan + " bulan");

    /*note:
    "?" adalah operasi ternari, sebagai fungsi pengganti fungsi percabangan IF dan else.
    */

    }
}