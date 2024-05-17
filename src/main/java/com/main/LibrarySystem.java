package com.main;
import java.util.Scanner;
import com.data.Student;
import com.data.Admin;

/*class MENU {
    boolean inputNIm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM (masukkan 99 untuk kembali): ");
        String Nim = scanner.next();
        if (Nim.length() == 15) {
            System.out.println("Successful Login as Student");
            return true;
        } else {
            System.out.println("Maaf anda tidak bisa login");
            return false;
        }
    }

}*/

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Student  student = new Student();

        while (true) {
            System.out.println("====Library Sistem====");
            System.out.println("1. Login as Mahasiswa");
            System.out.println("2. Login as Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    if (student.displayInfo()) {
                        student.menu();
                        break;
                    }else {}
                    break;
                case "2":
                    if(admin.loginAdmin()){
                        admin.menu();
                        break;
                    }else {}
                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}




























