package org.example;
import java.util.Scanner;

public class TugasModulSatu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        boolean showStudentOption = true;

        do {
            System.out.println("===== Library System =====");
            if (showStudentOption)
                System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    if (showStudentOption) {
                        System.out.print("Enter your NIM: ");
                        String NIM = scan.next();
                        if (NIM.length() == 15) {
                            System.out.println("Successful Login as Student");
                            //showStudentOption = false; // Tidak menampilkan opsi mahasiswa lagi
                        } else if (NIM.length() <= 15){
                            showStudentOption = false;
                            System.out.println("Panjang NIM harus 15 karakter");
                        }
                    } else {
                        System.out.println("Invalid Option");
                    }
                    break;
                case 2:
                        System.out.print("Enter your username (admin): ");
                        String username = scan.next();
                        System.out.print("Enter your password (admin): ");
                        String password = scan.next();
                        if (username.equals("admin") && password.equals("admin")) {
                            System.out.println("Successful Login as Admin");

                        } else {
                            showStudentOption = true;
                            System.out.println("Admin User Not Found!!");
                        }
                    break;
                case 3:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (choice != 3);
    }
}
