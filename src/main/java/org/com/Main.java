package org.com;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + counter + ": ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            try {
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                daftarSiswa.add(input);
                counter++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar nama mahasiswa:");
        for (String nama : daftarSiswa) {
            System.out.println(nama);
        }
    }
}
