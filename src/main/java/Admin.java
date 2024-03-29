import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
    ArrayList<Student> registeredStudents = new ArrayList<>();
    Student student = new Student();
    Scanner scan = new Scanner(System.in);
    String loggedNIM; // Menyimpan NIM mahasiswa yang berhasil login
    String adminUsername;
    String adminPassword;


    boolean loginAdmin() {
        System.out.print("Enter your username (admin): ");
        adminUsername = scan.next();
        System.out.print("Enter your password (admin): ");
        adminPassword = scan.next();
        if (adminUsername.equals("admin") && adminPassword.equals("admin")) {
            System.out.println("Successful Login as Admin");
            return true;
        } else {
            System.out.println("Admin User Not Found!!");
            return false;
        }
    }

    void AddStudent() {
        System.out.print("Masukkan nama mahasiswa: ");
        student.name = scan.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        student.nim = scan.nextLine();
        if (student.nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka.");
            return;
        }
        System.out.print("Masukkan Faculty: ");
        student.faculty = scan.nextLine();
        System.out.print("Masukkan Program: ");
        student.major = scan.nextLine();
        System.out.println("Data mahasiswa berhasil ditambahkan.");

        registeredStudents.add(student);
    }

    void displayStudent() {
        Student[] userStudents = new Student[2];

        userStudents[0] = new Student();
        userStudents[0].name = "Jack Sparrow";
        userStudents[0].faculty = "Teknik";
        userStudents[0].nim = "202310370311435";
        userStudents[0].major = "Informatika";

        userStudents[1] = new Student();
        userStudents[1].name = "Entity 09";
        userStudents[1].faculty = "Teknik";
        userStudents[1].nim = "202310370311420";
        userStudents[1].major = "Informatika";

        registeredStudents.add(userStudents[0]);
        registeredStudents.add(userStudents[1]);

        // Menampilkan data mahasiswa dengan looping
        if (registeredStudents.isEmpty()) {
            System.out.println("Tidak ada mahasiswa terdaftar.");
        } else {
            System.out.println("Daftar Mahasiswa Terdaftar:");
            for (Student student : registeredStudents) {
                System.out.println("Nama: " + student.name);
                System.out.println("NIM: " + student.nim);
                System.out.println("Fakultas: " + student.faculty);
                System.out.println("Program: " + student.major);
                System.out.println();

            }
        }
    }
}









